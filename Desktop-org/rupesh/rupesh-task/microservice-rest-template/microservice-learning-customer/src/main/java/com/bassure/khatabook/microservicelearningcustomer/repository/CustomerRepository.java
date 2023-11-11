/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.repository;

import com.bassure.khatabook.microservicelearningcustomer.dao.CustomerDAO;
import com.bassure.khatabook.microservicelearningcustomer.model.Address;
import com.bassure.khatabook.microservicelearningcustomer.model.Customer;
import com.bassure.khatabook.microservicelearningcustomer.repository.mapper.AddressRowMapper;
import com.bassure.khatabook.microservicelearningcustomer.repository.mapper.CustomerRowMapper;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bas200190
 */
@Repository
public class CustomerRepository implements CustomerDAO {

    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public CustomerRepository(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    

    
    
    @Override
    public int getLastCustomerId() {
        
        Customer lastCustomer = (Customer)jdbcTemplate.queryForObject("select * from KBK_customer,KBK_customer_address order by KBK_customer.customer_id desc ,KBK_customer_address.address_id desc limit 1 ", new CustomerRowMapper());
        return lastCustomer.getId();
    }
    
    
    

//    public boolean addCustomerInUsers(int customerId) {
//
//        String query = "insert into KBK_users values(? , ?)";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement prep_statement = connection.prepareStatement(query)) {
//
//            prep_statement.setInt(1, customerId);
//            prep_statement.setString(2, "1234");
//
//            int rows_count = prep_statement.executeUpdate();
//            if (rows_count == 1) {
//
//                return true;
//            }
//        } catch (SQLException sqle) {
//
//        }
//        return false;
//
//    }

//    public boolean addCustomerInUserRoles(int customerId) {
//
//        String query = "insert into KBK_user_roles values(? , ?)";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement prep_statement = connection.prepareStatement(query)) {
//
//            prep_statement.setInt(1, customerId);
//            prep_statement.setString(2, "CUSTOMER");
//
//            int rows_count = prep_statement.executeUpdate();
//            if (rows_count == 1) {
//
//                return true;
//            }
//        } catch (SQLException sqle) {
//
//        }
//        return false;
//
//    }
    
//    public boolean addAddress(Address address) {
//
//        String query = "insert into KBK_customer_address values(? , ? , ? , ? , ? , ?)";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement prep_statement = connection.prepareStatement(query)) {
//
//            prep_statement.setInt(1, setAddressId());
//            prep_statement.setInt(2, address.getCustomer_id());
//            prep_statement.setString(3, address.getDoorNo());
//            prep_statement.setString(4, address.getStreetName());
//            prep_statement.setString(5, address.getCity());
//            prep_statement.setInt(6, address.getPincode());
//
//            int rows_count = prep_statement.executeUpdate();
//            if (rows_count == 1) {
//
//                return true;
//            }
//        } catch (SQLException sqle) {
//
//        }
//        return false;
//
//    }
    
    @Override
    public int getLastAddressId() {
        
        Address address = (Address)jdbcTemplate.queryForObject("select * from KBK_customer_address order by address_id desc limit 1" , new AddressRowMapper());
        return address.getId();

    }

//    @Override
//    public boolean updateCustomer(Customer customer) {
//
//        String query_2 = "update KBK_customer set customer_name = ? , customer_address = ? where customer_phone_no = ?";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps_2 = connection.prepareStatement(query_2)) {
//            ps_2.setString(1, customer.getName());
//
////            ps_2.setString(2, customer.getAddress());
//            ps_2.setString(3, customer.getPhoneNo());
//
//            int update_returns = ps_2.executeUpdate();
//            if (update_returns == 1) {
//                return true;
//            }
//
//        } catch (Exception e) {
//
//        }
//
//        return false;
//    }
    
    
//    @Override
//    public boolean updateCustomerPhoneNO(String oldPhoneNo , String newPhoneNo) {
//
//        String query_1 = "update KBK_customer set customer_phone_no = ?  where customer_phone_no = ?";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps_1 = connection.prepareStatement(query_1)) {
//           
//
//            ps_1.setString(1, newPhoneNo);
//            ps_1.setString(2, oldPhoneNo);
//
//            int update_returns = ps_1.executeUpdate();
//            if (update_returns == 1) {
//                return true;
//            }
//
//        } catch (Exception e) {
//
//        }
//
//        return false;
//    }

    @Override
    public int addCustomer(Customer customer) {

        if (jdbcTemplate.update("insert into KBK_customer values(? , ? , ? , ? , ? , ? , ? , ? )", customer.getJoiningDateAndTime(), customer.getId(), customer.getName(), customer.getPhoneNo(), customer.getDebit(), customer.getAge(), customer.getGender(), customer.getStatus()) > 0) {
            if (jdbcTemplate.update("insert into KBK_customer_address values(? , ? , ? , ? , ? , ?)", customer.getAddress().getId(), customer.getAddress().getCustomer_id(), customer.getAddress().getDoorNo(), customer.getAddress().getStreetName(), customer.getAddress().getCity(), customer.getAddress().getPincode()) > 1) {
                return 1;
            }
        }
        return 1;
    }
    
    @Override
    public List<Customer> viewAllCustomer() {
        
        return jdbcTemplate.query("select * from KBK_customer,KBK_customer_address where KBK_customer.customer_id = KBK_customer_address.customer_id and KBK_customer.customer_status='active'", new CustomerRowMapper());
    }
    
    
    public Customer viewCustomer(Customer customer) {
        
        return (Customer)jdbcTemplate.queryForObject("select * from KBK_customer,KBK_customer_address where KBK_customer.customer_id = KBK_customer_address.customer_id and KBK_customer.customer_id="+customer.getId(), new CustomerRowMapper());
    }
    
    
    @Override
    public boolean deleteCustomerWithId(Customer customer){
        if (  jdbcTemplate.update("update KBK_customer set customer_status = 'inactive' where customer_id = ?" , customer.getId())>0) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public Customer updateCustomer(Customer customer){
        
        
        if (jdbcTemplate.update("update KBK_customer set customer_name=?,customer_phone_no=?,age=?,gender=? where customer_id=?",customer.getName(),customer.getPhoneNo(),customer.getAge(),customer.getGender(),customer.getId())>0 && jdbcTemplate.update("update KBK_customer_address set door_no=?,street_name=?,city=?,pincode=? where customer_id = ?",customer.getAddress().getDoorNo(),customer.getAddress().getStreetName(),customer.getAddress().getCity(),customer.getAddress().getPincode(),customer.getId())>0) {
            return viewCustomer(customer);
        }
        return viewCustomer(customer);
    }

//    @Override
//    public Customer viewParticularCustomer(String phoneNo) { //modified new argument
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection()) {
//
//            String query = "select * from KBK_customer where customer_phone_no = ?";
//            try (PreparedStatement ps = connection.prepareStatement(query)) {
//
//                ps.setString(1, phoneNo);
//
//                try (ResultSet rs = ps.executeQuery()) {
//                    if (rs.next()) {
//
//                        Date customer_joining_date = rs.getDate(1);
//                        int customer_id = rs.getInt(2);
//                        String customer_name = rs.getString(3);
//                        String customer_phoneNo = rs.getString(4);
//                        String customer_address = rs.getString(5);
//                        int customer_debit = rs.getInt(6);
//
////                        return new Customer(customer_id, customer_name, customer_phoneNo, customer_address, customer_debit);
//
//                    } else {
//                        System.out.println("please provide valid data of customer");
//                    }
//                }
//            }
//
//        } catch (NumberFormatException | SQLException e) {
//
//            System.out.println("please provide valid data of customer");
//        }
//
//        return null;
//    }

//    @Override
//    public boolean updateDebitAfterOrder(Customer customer) {
//        String query = "update KBK_customer set customer_debit = ? where customer_id = ? ";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps = connection.prepareStatement(query)) {
//            ps.setDouble(1, customer.getDebit());
////            ps.setInt(2, customer.getId());
//            int result = ps.executeUpdate();
//            if (result == 1) {
//                return true;
//            }
//        } catch (Exception e) {
//            System.out.println("Please Enter Valid Customer ID : ");
//        }
//        return false;
//    }

//    @Override
//    public Customer customerDetailsWRTName(String customer_name) {
//        String query = "select * from KBK_customer where customer_name = ?";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps = connection.prepareStatement(query)) {
//            ps.setString(1, customer_name);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
////                return new Customer(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6));
//            }
//        } catch (Exception e) {
//
//        }
//        return null;
//    }
    
//    @Override
//    public Customer customerDetailsWRTPhoneNo(String entered_customer_phoneNo) {
//        String query_1 = "select * from KBK_customer where customer_phone_no = ?";
//        Customer customer = null;
//
//        boolean loop = true;
//        while (loop) {
//            try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps_1 = connection.prepareStatement(query_1)) {
//                ps_1.setString(1, entered_customer_phoneNo);
//
//                try (ResultSet rs_1 = ps_1.executeQuery();) {
//
//                    if (rs_1.next()) {
//                        loop = false;
////                        customer = new Customer(rs_1.getInt(2), rs_1.getString(3), rs_1.getString(4), rs_1.getString(5), rs_1.getInt(6));
//                        return customer;
//                    }
//                } catch (Exception e) {
//
//                }
//            } catch (Exception e) {
//
//            }
//        }
//        return customer;
//    }

//    @Override
//    public Customer customerDetailsWRTCustomerId(int customer_id) {
//        String query_1 = "select * from KBK_customer where customer_id = ?";
//        Customer customer = null;
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps_1 = connection.prepareStatement(query_1)) {
//            ps_1.setInt(1, customer_id);
//
//            try (ResultSet rs_1 = ps_1.executeQuery();) {
//
//                if (rs_1.next()) {
////                    customer = new Customer(rs_1.getInt(2), rs_1.getString(3), rs_1.getString(4), rs_1.getString(5), rs_1.getInt(6));
//                }
//            } catch (Exception e) {
//
//            }
//        } catch (Exception e) {
//
//        }
//        return customer;
//    }
    
//    @Override
//    public void updateCustomerAfterPurchase(int customer_id, double latest_customer_debit) {
//        String query_4 = "update KBK_customer set customer_debit = ? where customer_id = ?";
//
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps_4 = connection.prepareStatement(query_4);) {
//            ps_4.setDouble(1, latest_customer_debit);
//            ps_4.setInt(2, customer_id);
//
//            ps_4.executeUpdate();
//        } catch (Exception e) {
//
//        }
//    }

    

//    public boolean checkCustomerNameIsAvailable(Customer customer) {
//        String query = "select * from KB_users where username = ?";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps = connection.prepareStatement(query)) {
//            ps.setString(1, customer.getName());
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return true;
//            }
//        } catch (Exception e) {
//
//        }
//        return false;
//    }

//    public boolean checkCustomerPhoneNoIsAvailable(Customer customer) {
//        String query = "select * from KBK_customer where customer_phone_no = ?";
//        try (Connection connection = MySQLKhataBookDAOimpl.dataSource.getConnection(); PreparedStatement ps = connection.prepareStatement(query)) {
//            ps.setString(1, customer.getPhoneNo());
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return true;
//            }
//        } catch (Exception e) {
//
//        }
//        return false;
//    }

}
