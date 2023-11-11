/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearning.controller;

import com.bassure.khatabook.microservicelearning.model.Customer;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author bas200190
 */
@Controller
public class KhatabookController {
    
    @GetMapping("/viewCustomers")
    public String viewCustomers(ModelMap data){
        Customer[] customers = new RestTemplate()
                .getForObject(URI.create("http://localhost:8081/customers"),Customer[].class);
        List<Customer> listOfCustomers = Arrays.asList(customers);
        data.addAttribute(listOfCustomers);
        return "view";
    }
    
    @PostMapping("/addCustomer")
    public Customer addCustomerFromWebAppication(ModelMap data,@RequestBody Customer customer){
        Customer customerDetails = new RestTemplate()
                .postForObject(URI.create("http://localhost:8081/addCustomer"),customer,Customer.class);
//        data.addAttribute(customerDetails);
        return customerDetails;
    }
    
    @PutMapping("updateCustomer")
    public Customer updateCustomerFromWebAppication(ModelMap data,@RequestBody Customer customer){
        Customer customerDetails = new RestTemplate()
                .patchForObject(URI.create("http://localhost:8081/updateCustomer"),customer,Customer.class);
        data.addAttribute(customerDetails);
        return customerDetails;
    }
    
    @DeleteMapping("deleteCustomer/{id}")
    public String deleteCustomerFromWebAppication(ModelMap data,@PathVariable(name = "id") int customerId){
         new RestTemplate()
                .delete(URI.create("http://localhost:8081/deleteCustomer/"+customerId));
        return "Successfully deleted";
    }
}
