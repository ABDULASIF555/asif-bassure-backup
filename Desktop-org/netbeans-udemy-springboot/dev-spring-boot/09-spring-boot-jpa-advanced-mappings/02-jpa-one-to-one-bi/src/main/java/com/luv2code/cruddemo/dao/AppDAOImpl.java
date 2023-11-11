/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bas200190
 */
@Repository
public class AppDAOImpl implements AppDAO {

    //define fields for entity manager
    //inject entity manager using constructor injection 
    private EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);  //this will also saves the instructor detail object because of CascadeType.All
    }

    @Override
    public Instructor findInstructorById(int theId) {
        return entityManager.find(Instructor.class, theId);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int theId) {
        //retrieve the instructor
        //delete the instructor 

        Instructor tempInstructor = entityManager.find(Instructor.class, theId);
        entityManager.remove(tempInstructor);
    }

    @Override
    public InstructorDetail findInstructorDetailById(int id) {
        return entityManager.find(InstructorDetail.class, id);
    }

//    @Override
//    @Transactional
//    public void deleteInstructorDetailById(int id) {
//       InstructorDetail findedInstructorDetail = entityManager.find(InstructorDetail.class, id);
//       entityManager.remove(findedInstructorDetail);
//    }
    
    @Override
    @Transactional
    public void deleteInstructorDetailOnlyById(int id) {
        InstructorDetail findedInstructorDetail = entityManager.find(InstructorDetail.class, id);
        findedInstructorDetail.getInstructor().setInstructorDetail(null);
        entityManager.remove(findedInstructorDetail);
    }

}
