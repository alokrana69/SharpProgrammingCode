package com.sharpnearProTestLevel2.org;

import java.util.Scanner;

//Example:-
//
//Input Array Contains Object Having Name and Salary.
//
//Babu_Rao 150
//
//Raju 160
//
//Shyam 140
//
//Pappu 200
//
//Output :-
//
//Pappu 200
//
//Raju 160
//
//Babu_Rao 150
//
//Shyam 140.

import java.util.Scanner;

class Employee {
    String name;
    int salary;
    
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public String toString() {
        return name + " " + salary;
    }
}

public class Sorting_Mechanism {
    public static Employee[] sortArray(Employee arr[], int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j].getSalary() < arr[j + 1].getSalary()) {
                    Employee temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        
        Employee[] arr = new Employee[n];
        System.out.println("Enter employee details (name salary): ");
        for (int i = 0; i < arr.length; i++) {
            String name = sc.next();
            int salary = sc.nextInt();
            arr[i] = new Employee(name, salary);
        }
        
        Employee[] output = sortArray(arr, n);
        
        System.out.println("Sorted Employees by Salary: ");
        for (Employee emp : output) {
            System.out.println(emp);
        }
    }
}











