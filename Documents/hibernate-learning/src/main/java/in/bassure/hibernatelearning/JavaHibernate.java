/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bassure.hibernatelearning;

import in.bassure.hibernatelearning.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author bas200190
 */
public class JavaHibernate {

    //update
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-jpa");
        EntityManager em = emf.createEntityManager();

        Student stud = em.find(Student.class, 3);
        System.out.println(stud);
        
        em.getTransaction().begin();
        stud.setStudentName("ibrahim_ismath");
        em.persist(stud);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }

    //delete
    public static void main3(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-jpa");
        EntityManager em = emf.createEntityManager();

        Student stud = em.find(Student.class, 1);
        System.out.println(stud);

        em.getTransaction().begin();
        em.remove(stud);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }

    //read
    public static void main2(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-jpa");
        EntityManager em = emf.createEntityManager();

        List<Student> students = em.createQuery("select s from Student s", Student.class).getResultList();
        System.out.println(students);

        em.close();
        emf.close();
    }

    //insert
    public static void main1(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-jpa");
        EntityManager em = emf.createEntityManager();

//        em.createQuery("insert into student value(1 , 'jobin' , 95)");
        Student stud = new Student(1, "jobin", 53);
        em.getTransaction().begin();
        em.persist(stud);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
