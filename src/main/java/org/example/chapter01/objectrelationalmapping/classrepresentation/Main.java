package org.example.chapter01.objectrelationalmapping.classrepresentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Foo");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp1");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        transaction.commit();
        entityManager.close();
//        tables will be deleted
//        entityManagerFactory.close();


    }
}