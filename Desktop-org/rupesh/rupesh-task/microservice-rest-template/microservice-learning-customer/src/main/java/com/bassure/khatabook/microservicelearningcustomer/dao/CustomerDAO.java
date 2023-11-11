/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.dao;

import com.bassure.khatabook.microservicelearningcustomer.model.Customer;
import java.util.List;

/**
 *
 * @author bas200190
 */
public interface CustomerDAO {
    
    public int getLastCustomerId();
    
    public int getLastAddressId();

    public int addCustomer(Customer customer);
    
    public Customer updateCustomer(Customer customer);

//    public boolean updateCustomer(Customer customer);
//    
//    public boolean updateCustomerPhoneNO(String oldPhoneNo , String newPhoneNo);

    public List<Customer> viewAllCustomer();
    
    public boolean deleteCustomerWithId(Customer customer);

//    public Customer viewParticularCustomer(String phoneNo);
//
//    public boolean updateDebitAfterOrder(Customer customer);
//    
//    public Customer customerDetailsWRTName(String customer_name);
//    
//    public Customer customerDetailsWRTPhoneNo(String customer_phone_no);
//
//    public Customer customerDetailsWRTCustomerId(int customer_id);
//    
//    public void updateCustomerAfterPurchase(int customer_id, double latest_customer_debit);

}
