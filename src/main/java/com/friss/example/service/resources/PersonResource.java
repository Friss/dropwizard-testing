package com.friss.example.service.resources;

import com.friss.example.service.person.Person;
import com.friss.example.service.dao.PersonDAO;
import com.friss.example.service.exceptions.ObjectNotFoundException;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

import java.util.List;

@Path("/person")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class PersonResource {

    PersonDAO personDAO;

    public PersonResource(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GET
    public List<Person> getAll(){
        return personDAO.getAll();
    }

    @SuppressWarnings("unchecked")
	@GET
    @Path("/{id}")
    public Person get(@PathParam("id") Integer id){
        Person person = personDAO.findById(id);
        if (person != null) {
            return person;
        }else{
        	JSONObject obj = new JSONObject();
            obj.put("id", id);
            obj.put("status", "error");
            obj.put("errorMsg", "Person not found.");
            throw new ObjectNotFoundException(obj);
        }
    }

    @POST
    public Person add(@Valid Person person) {
        int newId = personDAO.insert(person);

        return person.setId(newId);
    }

    @PUT
    @Path("/{id}")
    public Person update(@PathParam("id") Integer id, @Valid Person person) {
        person = person.setId(id);
        personDAO.update(person);

        return person;
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Integer id) {
        personDAO.deleteById(id);
    }
}