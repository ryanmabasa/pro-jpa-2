package org.example.chapter03.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Foo");

        Department department = new Department();
        department.setName("SM");
        department.setId(1L);

        ParkingSpace parkingSpace = new ParkingSpace();
        parkingSpace.setId(1L);
        parkingSpace.setEmployee(employee);

        employee.setDepartment(department);
        employee.setParkingSpace(parkingSpace);


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