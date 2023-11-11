package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
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
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
            createMultipleStudents(studentDAO);
//            readStudent(studentDAO);
//            queryForStudents(studentDAO);
//            queryForStudentsLastNameInDesc(studentDAO);
//            queryForStudentsByLastName(studentDAO);
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO);
//            deleteAllStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        //create the student object
        System.out.println("creating new student object");
        Student tempStudent = new Student("paul", "doe", "paul@luv2code.com");

        //save the student object
        System.out.println("saving the student object");
        studentDAO.save(tempStudent);

        //display the id of the saved student object
        System.out.println("saved student id :" + tempStudent.getId());
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("creating new student object");
        Student tempStudent1 = new Student("abdul", "asif", "abdul@luv2code.com");
        Student tempStudent2 = new Student("ibrahim", "ismath", "ibrahim@luv2code.com");
        Student tempStudent3 = new Student("abdul", "lathif", "lathif@luv2code.com");

        System.out.println("saving the student object");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

        System.out.println("saved student id :" + tempStudent1.getId());
        System.out.println("saved student id :" + tempStudent2.getId());
        System.out.println("saved student id :" + tempStudent3.getId());
    }

    public void readStudent(StudentDAO studentDAO) {
        Student tempStudent = new Student("samsu", "nisha", "samsu@gmail.com");

        studentDAO.save(tempStudent);

        System.out.println("id of the saved student : " + tempStudent.getId());

        Student findedStudent = studentDAO.findById(tempStudent.getId());

        System.out.println("finded student : " + findedStudent);
    }
    
    public void queryForStudents(StudentDAO studentDAO){
        List<Student> allStudents = studentDAO.findAll();
        for (Student student : allStudents) {
            System.out.println(student);
        }
    }
    
    public void queryForStudentsLastNameInDesc(StudentDAO studentDAO){
        List<Student> allStudents = studentDAO.findAllByLastNameInDescendingOrder();
        for (Student student : allStudents) {
            System.out.println(student);
        }
    }
    
    public void queryForStudentsByLastName(StudentDAO studentDAO){
        List<Student> allStudents = studentDAO.findAllByLastName("asif");
        for (Student student : allStudents) {
            System.out.println(student);
        }
    }
    
    public void updateStudent(StudentDAO studentDAO){
        int studentId  = 1;
        System.out.println("retrieve student based on id : "+ studentId);
        Student student = studentDAO.findById(studentId);
        
        student.setFirstName("paul");
        studentDAO.update(student);
        
        System.out.println(student);
        
        Student updatedStudent = studentDAO.findById(studentId);
        
        System.out.println(updatedStudent);
        
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 3000;
        System.out.println("delete the student : "+studentId);
        studentDAO.delete(studentId);
    }
    
    private void deleteAllStudent(StudentDAO studentDAO){
        System.out.println("deleteing all the student");
        int noOfRowsDeleted = studentDAO.deleteAll();
        System.out.println("Number of rows to be deleted : "+noOfRowsDeleted);
    }
}
