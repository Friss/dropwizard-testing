package com.friss.example.service.dao;

import com.friss.example.service.person.Person;
import com.friss.example.service.person.mapper.PersonMapper;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(PersonMapper.class)
public interface PersonDAO {

    @SqlQuery("select * from PEOPLE")
    List<Person> getAll();

    @SqlQuery("select * from PEOPLE where ID = :id")
    Person findById(@Bind("id") int id);

    @SqlUpdate("delete from PEOPLE where ID = :id")
    int deleteById(@Bind("id") int id);

    @SqlUpdate("update PEOPLE set FIRSTNAME = :firstName, LASTNAME = :lastName, EMAIL = :email, COUNTRY = :country, IPADDRESS = :ipAddress, COMPANYNAME = :companyName, JOBTITLE = :jobTitle, BITCOINADDRESS = :bitcoinAddress, city = :city, state = :state, zipcode = :zipcode, address = :address  where ID = :id")
    int update(@BindBean Person person);

    @SqlUpdate("insert into PEOPLE (FIRSTNAME, LASTNAME, EMAIL, COUNTRY, IPADDRESS, COMPANYNAME, JOBTITLE, BITCOINADDRESS, CITY, STATE, ZIPCODE, ADDRESS) values (:firstName, :lastName, :email, :country, :ipAddress, :companyName, :jobTitle, :bitcoinAddress, :city, :state, :zipcode, :address)")
    @GetGeneratedKeys
    int insert(@BindBean Person person);
}