/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.controller;

import com.bassure.khatabook.microservicelearningcustomer.model.Customer;
import com.bassure.khatabook.microservicelearningcustomer.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bas200190
 */
@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> showAllUsers(ModelMap data) {

        List<Customer> customers = customerService.getAllCustomers();
        return customers;
    }
    
    @PostMapping("/addCustomer")
    public Customer addCustomerForCustomerApplication(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
        
    }
    
    @PutMapping("/updateCustomer")
    public Customer updateCustomerForCustomerApplication(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
        
    }
    
    @DeleteMapping("deleteCustomer/{id}")
    public boolean deleteCustomerFromCustomerAppication(ModelMap data,@PathVariable(name = "id") int customerId){
        Customer tempCustomer = new Customer();
        tempCustomer.setId(customerId);
        return customerService.deleteCustomer(tempCustomer);
    }

}
