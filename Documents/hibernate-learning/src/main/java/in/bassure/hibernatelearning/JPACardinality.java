/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bassure.hibernatelearning;

import in.bassure.hibernatelearning.model.Contact;
import in.bassure.hibernatelearning.model.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author bas200190
 */
public class JPACardinality  {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-jpa");
        EntityManager em = emf.createEntityManager();
        

        Member member = em.find(Member.class, 1L);
        for (Contact contact : member.getContacts()) {
            System.out.println(contact);
        }

        
        
        em.close();
        emf.close();
    }
}
