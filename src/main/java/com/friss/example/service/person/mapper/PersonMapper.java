package com.friss.example.service.person.mapper;

import com.friss.example.service.person.Person;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements ResultSetMapper<Person>
{
    public Person map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException
    {
        return new Person()
                .setId(resultSet.getInt("ID"))
                .setFirstName(resultSet.getString("FIRSTNAME"))
        		.setLastName(resultSet.getString("LASTNAME"))
        		.setEmail(resultSet.getString("EMAIL"))
        		.setCountry(resultSet.getString("COUNTRY"))
        		.setCompanyName(resultSet.getString("COMPANYNAME"))
        		.setJobTitle(resultSet.getString("JOBTITLE"))
        		.setBitcoinAddress(resultSet.getString("BITCOINADDRESS"))
        		.setCity(resultSet.getString("CITY"))
        		.setState(resultSet.getString("STATE"))
        		.setZipcode(resultSet.getString("ZIPCODE"))
        		.setAddress(resultSet.getString("ADDRESS"))
        		.setIpAddress(resultSet.getString("IPADDRESS"));
    }
}
