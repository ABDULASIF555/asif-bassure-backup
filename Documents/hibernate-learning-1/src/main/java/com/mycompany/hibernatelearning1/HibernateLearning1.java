///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// */
//package com.mycompany.hibernatelearning1;
//
//import com.mycompany.model.Contact;
//import com.mycompany.model.Contact2;
//
//import com.mycompany.model.Member;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//import java.util.List;
//
//public class HibernateLearning1 {
//
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_l");
//        EntityManager em = emf.createEntityManager();
//        try {
//            List<Contact2> contacts = em.createQuery("Contact2.findAll", Contact2.class).getResultList();
//
//            for (Contact2 contact : contacts) {
//                System.out.println(contact);
//            }
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//
//    public static void main5(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_l");
//        EntityManager em = emf.createEntityManager();
//        try {
//            List<Contact2> contacts = em.createQuery("select c from contact2 c where c.contactId >= ?1 and c.member.memberId = ?2", Contact2.class).setParameter(1, 8l).setParameter(2, 1l).getResultList();
//
//            System.out.println(contacts);
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//
//    public static void main4(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_l");
//        EntityManager em = emf.createEntityManager();
//        try {
//            Contact2 temp = (Contact2) em.createNativeQuery("select * from contacts where contact_id = 13", Contact2.class).getSingleResult();
//            System.out.println(temp);
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//
//    public static void main2(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_l");
//        EntityManager em = emf.createEntityManager();
//        try {
//            Contact2 contact2 = em.find(Contact2.class, 13L);
//            System.out.println(contact2);
//            System.out.println(contact2.getMember());
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//
//    public static void main1(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_l");
//        EntityManager em = emf.createEntityManager();
//        try {
//            Member member = em.find(Member.class, 1L);
//
//            System.out.println(member);
//
//            for (Contact contact : member.getConatctList()) {
//                System.out.println(contact);
//            }
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//}
