package org.example.chapter03.onetoonebidirectional;

import javax.persistence.*;

//@Entity
public class Employee {

    @Id
    private Long id;
    @Column
    private String name;

    @Column
    private long salary;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="DEPT_ID")
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PSPACE_ID")
    private ParkingSpace parkingSpace;

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
