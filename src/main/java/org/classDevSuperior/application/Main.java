package org.classDevSuperior.application;

import org.classDevSuperior.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Locale is so we can put the period after the number instead of the comma
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.println("How many employees will be registrated? ");
        int N = sc.nextInt();

        //Number ("i") of employee
        for (int i=0; i<N; i++){

            System.out.println("\nEmployee " + (i+1) + ": " );
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");

            //clean buffer of entrance
            sc.nextLine();

            //read until the break line
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println("\nEnter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        //it's a lambda --> Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        Integer pos = position (list, idSalary);
        if(pos == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }



        System.out.println("\nList of employees: ");
        for (Employee emp : list){
            System.out.println(emp);
        }
        sc.close();
    }

  //what position it's the id (in the List)?
    public static Integer position (List<Employee> list, int id){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}