package org.example.chapter02.cdi.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/*
* A qualifier is an annotation that is used to constrain or distinguish a b
* ean type from other bean types that have the same inherited or implemented interface type.
* A qualifier can help the container resolve which bean type to inject.

The qualifier annotation class is typically defined by the application and then used to annotate one or more bean classes.
*  The qualifier annotation definition should be annotated with the @Qualifier meta-annotation,
* defined in the jakarta.inject package. An example of defining a qualifier annotation is in Listing 3-18.

Listing 3-18: Qualifier Annotation Definition
@Qualifier
@Target({METHOD, FIELD, PARAMETER, TYPE})
@Retention(RUNTIME)
public @interface Secure { }

This annotation can now be used on a bean class, such as the new SecureDeptService bean shown in Listing 3-19.
* The qualifier indicates that the bean is a secure variety of DeptService, as opposed to a regular (nonsecure?) one.
@Secure
public class SecureDeptService extends DeptService { ... }
*
* *
* */


//@Qualifier
@Target({METHOD, FIELD, PARAMETER, TYPE})
@Retention(RUNTIME)
public @interface Secure { }


