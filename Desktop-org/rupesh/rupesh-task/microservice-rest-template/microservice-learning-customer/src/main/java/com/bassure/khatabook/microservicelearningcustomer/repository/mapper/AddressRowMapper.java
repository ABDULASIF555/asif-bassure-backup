/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.khatabook.microservicelearningcustomer.repository.mapper;

import com.bassure.khatabook.microservicelearningcustomer.model.Address;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author bas200190
 */
public class AddressRowMapper implements RowMapper{

    @Override
    public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Address(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
    }
    
}
