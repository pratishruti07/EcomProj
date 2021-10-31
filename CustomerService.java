package com.sboot.Ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.Ecom.dao.CustomerDao;
import com.sboot.Ecom.model.Customer;

import java.util.*;

@Service
public class CustomerService {
	
       @Autowired
       private CustomerDao customerDao;
 
      
       
       public List<Customer> saveCustomer(List<Customer>  customers) {
    	return customerDao.saveAll(customers);
       }
       
       
       public List<Customer> getCustomers(){ 
    	   return customerDao.findAll();
       }
       
       public Customer getCustomer(int custId) {
    	return  customerDao.findById(custId).get();
		
	
    	   
       } 
       
       
}


