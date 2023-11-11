/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import java.util.List;

/**
 *
 * @author bas200190
 */
public interface StudentDAO {
    void save(Student newStudent);
    Student findById(int id);
    List<Student> findAll();
    List<Student> findAllByLastNameInDescendingOrder(); //seperate example 
    List<Student> findAllByLastName(String lastName); 
    void update(Student student);
    void delete(Integer id);
    int deleteAll();
}
