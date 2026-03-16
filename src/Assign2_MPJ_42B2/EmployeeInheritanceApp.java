package Assign2_MPJ_42B2;

import java.util.Scanner;

// Parent Class
class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary(double newSalary) {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Name              : " + name);
        System.out.println("Original Salary   : " + salary);
        System.out.println("Salary After Hike : " + newSalary);
    }
}

// Child Class - Full Time
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public double salaryAfterHike() {
        return salary + (0.50 * salary);
    }
}

// Child Class - Intern
class InternEmployee extends Employee {

    public InternEmployee(String name, double salary) {
        super(name, salary);
    }

    public double salaryAfterHike() {
        return salary + (0.25 * salary);
    }
}

// Main Class
public class EmployeeInheritanceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Employee Type:");
        System.out.println("1) Full Time Employee (50% hike)");
        System.out.println("2) Intern Employee (25% hike)");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();  // clear buffer

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        if (choice == 1) {
            FullTimeEmployee f = new FullTimeEmployee(name, salary);
            double newSalary = f.salaryAfterHike();
            f.displaySalary(newSalary);
        }
        else if (choice == 2) {
            InternEmployee i = new InternEmployee(name, salary);
            double newSalary = i.salaryAfterHike();
            i.displaySalary(newSalary);
        }
        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}