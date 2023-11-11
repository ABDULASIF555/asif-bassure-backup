package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.Course;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import com.luv2code.cruddemo.entity.Review;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO){
        return runner -> {
//            createCourseAndReviews(appDAO);
//            retrieveCourseWithReviews(appDAO);
            deleteCourseWithReviews(appDAO);
        };
    }

    private void createInstructor(AppDAO appDAO) {
        //create the instructor 
        //associate the objects
        //save the instructor  NOTE:this will also save the InstructorDetails object bcause of cascadeType.All
        Instructor instructor = new Instructor("abdul","asif","abdulasif@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://abdulasif.com/youtube","coding ");
//        Instructor instructor = new Instructor("arun","kumar","arunkumar@gmail.com");
//        InstructorDetail instructorDetail = new InstructorDetail("http://arunbawa.com/youtube","goat cutting");
        instructor.setInstructorDetail(instructorDetail);
        
        System.out.println("saving instructor: "+instructor);
        appDAO.save(instructor);
        System.out.println("Done!!");
    }

    private void findInstructor(AppDAO appDAO) {
        int theId = 1;
        System.out.println("finding Instructor the id is : "+theId);
        
        Instructor findedInstructor = appDAO.findInstructorById(theId);
        
        System.out.println("Finded Instructor : "+findedInstructor);
        System.out.println("The Associated Instructor Details only"+findedInstructor.getInstructorDetail());
    }

    private void deleteInstructor(AppDAO appDAO) {
        int theId = 1;
        System.out.println("To delete the Instructor of id  : ");
        
        appDAO.deleteInstructorById(theId);
        
        System.out.println("deleted");
    }
    
    private void findInstructorDetail(AppDAO appDAO){
        int id = 1;
        System.out.println("Instructor details id is : "+id);
        InstructorDetail findedInstructorDetail = appDAO.findInstructorDetailById(id);
        System.out.println("Finded Instructor Details : "+findedInstructorDetail);
        System.out.println("Associated Instructor : "+findedInstructorDetail.getInstructor());
    }

//    private void deleteInstructorDetail(AppDAO appDAO) {
//        int theInstructorDetailId = 1;
//        System.out.println("To delete the Instructor Details of Id : "+theInstructorDetailId);
//        appDAO.deleteInstructorDetailById(theInstructorDetailId);
//        System.out.println("Done!!!");
//    }

    private void deleteInstructorDetailOnly(AppDAO appDAO) {
        int theInstructorDetailId = 3;
        System.out.println("To delete the Instructor Details of Id : "+theInstructorDetailId);
        appDAO.deleteInstructorDetailOnlyById(theInstructorDetailId);
        System.out.println("Done!!!");
    }

    private void createInstructorWithCourses(AppDAO appDAO) {
        Instructor instructor = new Instructor("faizal","ali","abdulasif@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://faizal.com/youtube","gaming");
        
        instructor.setInstructorDetail(instructorDetail);
        
        Course course1 = new Course("Air guitar");
        Course course2 = new Course("Piano");
        
        instructor.addCourse(course1);
        instructor.addCourse(course2);
        
        System.out.println("Saving Instructor : "+instructor);
        System.out.println("Saving Instructor's courses : "+instructor.getCourses());
        
        appDAO.save(instructor);
        
        System.out.println("Done");
    }

    private void findInstructorWithCourses(AppDAO appDAO) {
       int instructorId = 1;
        System.out.println("to find instructor with id : "+instructorId);
        Instructor findedeInstructor = appDAO.findInstructorById(instructorId);
        System.out.println("finded instructor : "+findedeInstructor);
        System.out.println("that insructor associated courses : "+findedeInstructor.getCourses());
    }

    private void findCoursesForInstructor(AppDAO appDAO) {
        int theId = 1;
        System.out.println("Instructor to find the id is: "+theId);
        Instructor findedInstructor = appDAO.findInstructorById(theId);
        System.out.println("finded instructor : "+findedInstructor);
        
        System.out.println("To find the courses of Instructor Id : "+theId);
        List<Course> findedCourse  = appDAO.findCoursesByInstructorId(theId);
        
        findedInstructor.setCourses(findedCourse);
//        
        System.out.println("finded Course : "+findedInstructor.getCourses());
        System.out.println("Done..");
    }

    private void findInstructorWithCoursesJoinFetch(AppDAO appDAO) {
        int theId = 1;
        System.out.println("To find the instructor of id : "+theId);
        
        Instructor findedInstructor = appDAO.findInstructorByIdJoinFetch(theId);
        System.out.println("Finded Instructor : "+ findedInstructor);
        System.out.println("That Associated Instructor Details : "+findedInstructor.getInstructorDetail());
        System.out.println("That Associated Courses : "+findedInstructor.getCourses());
        System.out.println("DONE!!");
    }

    private void updateInstructor(AppDAO appDAO) {
        int theId = 1;
        System.out.println("instructor id to find : "+theId);
        
        Instructor findedInstructor = appDAO.findInstructorById(theId);
        System.out.println("Before Udate : "+findedInstructor);
//        
        findedInstructor.setLastName("ahamed");
        appDAO.update(findedInstructor);
        System.out.println("after update : "+findedInstructor);
    }

    private void updateCourse(AppDAO appDAO) {
        int theId = 10;
        System.out.println("course id to find : "+theId);
        
        Course course = appDAO.findCourseByCourseId(theId);
        
        System.out.println("before update : "+course);
        
        course.setTitle("cricket");
        appDAO.update(course);
        System.out.println("after update : "+course);
        
    }

    private void deleteCourse(AppDAO appDAO) {
        int theId = 10;
        System.out.println("To delete the course of course Id : "+theId);
        
        appDAO.deleteCourse(theId);
        System.out.println("deleted");
    }

    private void createCourseAndReviews(AppDAO appDAO) {
        //create course
        //add some reviews
        //save the course
        
        //create course
        Course course = new Course("Pacman-How to score one million points");
        
        //add some reviews
        Review review1 = new Review("Great course... loved it!");
        Review review2 = new Review("cool course well done!!");
        Review review3 = new Review("what a dumb cours!");
        
        course.addReview(review1);
        course.addReview(review2);
        course.addReview(review3);
        
        //save the course and leverage cascade all
        appDAO.save(course);
        System.out.println("Done!!!");
    }

    private void retrieveCourseWithReviews(AppDAO appDAO) {
        int theId = 10;
        Course retrievedCourse = appDAO.findCourseAndReviewsWithId(theId);
        System.out.println("Retrieved Course : "+retrievedCourse);
        System.out.println("Associated Reviews : "+retrievedCourse.getReviews());
    }

    private void deleteCourseWithReviews(AppDAO appDAO) {
        int theId = 10;
        appDAO.deleteCourse(theId);
        System.out.println("Done!!!");
    }
    
    
}
