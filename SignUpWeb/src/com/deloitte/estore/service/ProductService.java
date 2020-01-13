package com.deloitte.estore.service;

import java.sql.Connection;





import java.util.List;







import com.deloitte.estore.model.Person;

public interface ProductService {
boolean addPerson(Person person) throws Exception;
Person getPersonById(String userName) throws Exception;
Connection getDbConnection() throws Exception;

}