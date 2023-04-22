package org.example.chapter01.objectrelationalmapping.classrepresentation;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Employee {

    @Id
    private Long id;
    @Column
    private String name;

    @Column
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column
    private long salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
