/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Course;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import com.luv2code.cruddemo.entity.Student;
import java.util.List;

/**
 *
 * @author bas200190
 */
public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int id);
//    void deleteInstructorDetailById(int id);

    void deleteInstructorDetailOnlyById(int id);

    List<Course> findCoursesByInstructorId(int instructorid);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor instructor);

    void update(Course course);

    Course findCourseByCourseId(int courseId);

    void deleteCourse(int courseId);

    void save(Course theCourse);

    Course findCourseAndReviewsWithId(int courseId);

    Course findCourseAndStudentsByCourseId(int courseId);

    Student findStudentAndCoursesWithStudentId(int studentId);
    
    void update(Student student);

    public void deleteStudentById(int theId);
//    public void deleteStudentById(Student student);

    public void createNewStudent(Student student);
}
