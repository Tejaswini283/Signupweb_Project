package com.deloitte.estore.service;
import java.sql.Connection;
import java.util.List;
import com.deloitte.estore.model.Person;
import com.deloitte.estore.repo.PersonRepo;
import com.deloitte.estore.repo.PersonRepoImp1;
public class ProductServiceImp implements ProductService {
    PersonRepo repo;
    public ProductServiceImp() {
    	repo=new PersonRepoImp1();
    }

	@Override
	public boolean addPerson(Person person) throws Exception {
	return repo.addPerson(person);
	}
	@Override
	public Person getPersonById(String userName) throws Exception {

		return repo.getPersonById(userName);
	}

	@Override
	public Connection getDbConnection() throws Exception {
	return null;
	}

}