package com.cognizant.EmployeeApi.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

 

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Employee {
    @Id
    private int id;
    private String name;
    private String gender;
    private int age;
    private double salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(int id, String name, String gender, int age, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

}
