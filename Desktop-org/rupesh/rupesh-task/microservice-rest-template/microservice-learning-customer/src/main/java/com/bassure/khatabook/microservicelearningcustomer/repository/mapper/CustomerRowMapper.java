/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.repository.mapper;

import com.bassure.khatabook.microservicelearningcustomer.model.Address;
import com.bassure.khatabook.microservicelearningcustomer.model.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author bas200190
 */
public class CustomerRowMapper implements RowMapper {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new Customer(rs.getObject(1, LocalDateTime.class), rs.getInt(2), 
                rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getInt(6),
                rs.getString(7), rs.getString(8), new Address(rs.getInt(9), 
                rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14)));
//            return new Customer(rs.getObject(1, LocalDateTime.class), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8));
    }

}
