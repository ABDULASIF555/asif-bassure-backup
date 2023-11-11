/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Course;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.List;
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
        List<Course> associatedCourses = tempInstructor.getCourses();
        for (Course associatedCourse : associatedCourses) {
            associatedCourse.setInstructor(null);
        }
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

    @Override
    public List<Course> findCoursesByInstructorId(int instructorid) {
        TypedQuery<Course> query = entityManager.createQuery("FROM Course WHERE instructor.id = :data  ", Course.class);
        query.setParameter("data", instructorid);
        return query.getResultList();
    }

    @Override
    public Instructor findInstructorByIdJoinFetch(int theId) {
        TypedQuery<Instructor> query = entityManager.createQuery("SELECT i from Instructor i JOIN FETCH i.courses WHERE i.id =:data", Instructor.class);
        query.setParameter("data", theId);
        return query.getSingleResult();
    }

    @Override
    @Transactional
    public void update(Instructor instructor) {
        entityManager.merge(instructor);
    }

    @Override
    @Transactional
    public void update(Course course) {
        entityManager.merge(course);
    }

    @Override
    public Course findCourseByCourseId(int courseId) {
        return entityManager.find(Course.class, courseId);
    }

    @Override
    @Transactional
    public void deleteCourse(int courseId) {
        Course course = entityManager.find(Course.class, courseId);
        entityManager.remove(course);
    }

    @Override
    @Transactional
    public void save(Course theCourse) {
        entityManager.persist(theCourse);
    }

    @Override
    public Course findCourseAndReviewsWithId(int courseId) {
        TypedQuery<Course> query = entityManager.createQuery("SELECT c FROM Course c JOIN FETCH c.reviews WHERE c.id=:data ", Course.class);
        query.setParameter("data", courseId);
        return query.getSingleResult();
    }

    @Override
    public Course findCourseAndStudentsByCourseId(int courseId) {
        TypedQuery<Course> query = entityManager.createQuery("SELECT c FROM Course c JOIN FETCH c.students WHERE c.id=:data", Course.class);
        query.setParameter("data", courseId);
        Course findedCourse = query.getSingleResult();
        return findedCourse;
    }

    @Override
    public Student findStudentAndCoursesWithStudentId(int studentId) {
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s JOIN FETCH s.courses WHERE s.id=:data", Student.class);
        query.setParameter("data", studentId);
        Student findedStudent = query.getSingleResult();
        return findedStudent;
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void createNewStudent(Student student) {
        entityManager.persist(student);
    }

    
    
    @Override
    @Transactional
    public void deleteStudentById(int studentId) {
        Student findedStudent = entityManager.find(Student.class, studentId);
        System.out.println("finded student in appDAOImpl : "+findedStudent);
        entityManager.remove(findedStudent);
    }
    
//    @Override
//    @Transactional
//    public void deleteStudentById(Student student) {
//        
//        
//        entityManager.remove(student);
//    }

    
    
}
