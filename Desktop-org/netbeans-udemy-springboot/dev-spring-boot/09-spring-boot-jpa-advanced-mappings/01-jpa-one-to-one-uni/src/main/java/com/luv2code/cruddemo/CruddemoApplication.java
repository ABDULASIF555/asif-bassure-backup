package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
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
//            createInstructor(appDAO);
//            findInstructor(appDAO);
//            deleteInstructor(appDAO);
        };
    }

    private void createInstructor(AppDAO appDAO) {
        //create the instructor 
        //associate the objects
        //save the instructor  NOTE:this will also save the InstructorDetails object bcause of cascadeType.All
//        Instructor instructor = new Instructor("abdul","asif","abdulasif@gmail.com");
//        InstructorDetail instructorDetail = new InstructorDetail("http://abdulasif.com/youtube","coding ");
        Instructor instructor = new Instructor("arun","kumar","arunkumar@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://arunbawa.com/youtube","goat cutting");
        instructor.setInstructorDetail(instructorDetail);
        
        System.out.println("saving instructor: "+instructor);
        appDAO.save(instructor);
        System.out.println("Done!!");
    }

    private void findInstructor(AppDAO appDAO) {
        int theId = 2;
        System.out.println("finding Instructor the id is : "+theId);
        
        Instructor findedInstructor = appDAO.findInstructorById(theId);
        
        System.out.println("Finded Instructor : "+findedInstructor);
        System.out.println("The Associated Instructor Details only"+findedInstructor.getInstructorDetail());
    }

    private void deleteInstructor(AppDAO appDAO) {
        int theId = 2;
        System.out.println("To delete the Instructor of id  : ");
        
        appDAO.deleteInstructorById(theId);
        
        System.out.println("deleted");
    }
    
}
