/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bas200190
 */
@Repository 
//@Primary
public class StudentDAOImpl implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;
    
    //inject entity manager using constructor injection 
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
        
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
    
    @Override
    public Student findById(int id){
        return entityManager.find(Student.class, id);
    }
    
    public List<Student> findAll(){
        TypedQuery<Student> typedQuery = entityManager.createQuery("FROM Student", Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public List<Student> findAllByLastNameInDescendingOrder() {
        TypedQuery<Student> typedQuery = entityManager.createQuery("FROM Student ORDER BY lastName DESC", Student.class);
        return typedQuery.getResultList();
    }
    
    @Override
    public List<Student> findAllByLastName(String lastName) {
        TypedQuery<Student> typedQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);
        typedQuery.setParameter("theData", lastName);
        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAll() {
        return entityManager.createQuery("DELETE from Student").executeUpdate();
        
    }
         
    
    
}
