package org.example.chapter02.cdi.producer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@RequestScoped
public class MyAppProducers {
//    @Produces
    @MyApp1
    @PersistenceContext(unitName="MyApp1")
    private EntityManager em1;

//    @Produces
    @MyApp2
    @PersistenceContext(unitName="MyApp2")
    private EntityManager em2;
}
