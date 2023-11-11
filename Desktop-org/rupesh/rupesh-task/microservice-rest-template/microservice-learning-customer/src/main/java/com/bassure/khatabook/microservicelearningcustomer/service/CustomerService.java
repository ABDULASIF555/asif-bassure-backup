/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.service;

import com.bassure.khatabook.microservicelearningcustomer.model.Address;
import com.bassure.khatabook.microservicelearningcustomer.model.Customer;
import com.bassure.khatabook.microservicelearningcustomer.repository.CustomerRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bas200190
 */
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    
    
    public List<Customer> getAllCustomers(){
        return customerRepository.viewAllCustomer();
    }
    
    public  Customer addCustomer(Customer customer){
        int customerId = customerRepository.getLastCustomerId();
        int addressId = customerRepository.getLastAddressId();
        
        if (customerId != 0) {
            customerId = customerId + 1;
        } else {
            customerId = 501;
        }
        
        if (addressId != 0) {
            addressId = addressId + 1;
        } else {
            addressId = 1;
        }
        
        Address address1 = new Address(addressId,customerId,customer.getAddress().getDoorNo(),customer.getAddress().getStreetName(),customer.getAddress().getCity(),customer.getAddress().getPincode());
        Customer customer1 = new Customer(LocalDateTime.now(), customerId, customer.getName(),customer.getPhoneNo(), 0, customer.getAge(), customer.getGender(), "active" , address1);
        
        customerRepository.addCustomer(customer1);
        List<Customer> customers = customerRepository.viewAllCustomer();
        return customers.get(customers.size()-1);
    }
    
    public boolean deleteCustomer(Customer customer){
        return customerRepository.deleteCustomerWithId(customer);
    }
    
    public Customer updateCustomer(Customer customer){
        return customerRepository.updateCustomer(customer);
    }
}
