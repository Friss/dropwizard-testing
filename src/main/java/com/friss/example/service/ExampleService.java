package com.friss.example.service;


import org.skife.jdbi.v2.DBI;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.friss.example.service.config.ExampleServiceConfiguration;
import com.friss.example.service.dao.PersonDAO;
import com.friss.example.service.resources.PersonResource;

public class ExampleService extends Application<ExampleServiceConfiguration> {
	
	@Override
    public String getName() {
		return "dropwizard-example";
    }
	
	
    public static void main(String[] args) throws Exception {
        new ExampleService().run(args);
    }

    @Override
    public void initialize(Bootstrap<ExampleServiceConfiguration> bootstrap) {
        
    }

    @Override
    public void run(ExampleServiceConfiguration conf, Environment env) throws Exception {
    	final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(env, conf.getDataSourceFactory(), "mysql");
        
        final PersonDAO personDAO = jdbi.onDemand(PersonDAO.class);
        final PersonResource personResource = new PersonResource(personDAO);
        env.jersey().register(personResource);
    }

}