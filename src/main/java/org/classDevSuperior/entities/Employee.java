package org.classDevSuperior.entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    //Constructor empty
    public Employee (){

    }

    //Constructor full
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary (double percentage) {
        salary += percentage*salary / 100.0;
    };

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

    //Getters and Setters
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
