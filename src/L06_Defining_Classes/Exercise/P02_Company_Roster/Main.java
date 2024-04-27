package L06_Defining_Classes.Exercise.P02_Company_Roster;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

       List<Department> departments = new ArrayList<>();

        while (n-- > 0){
            String input = sc.nextLine();
            String[] tokens = input.split("\\s+");
            String employeeName = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String departmentName = tokens[3];
            String email;
            int age;


            Department department = departments.stream().
                    filter(d -> d.getName().equals(departmentName)).findFirst()
                    .orElseGet(() -> {
                        Department newDepartment = new Department(departmentName);
                        departments.add(newDepartment);
                        return newDepartment;
                    });

            Employee employee = new Employee(employeeName, salary, position, department);

            if (tokens.length == 5){
                if (tokens[4].contains("@")) {
                    email = tokens[4];
                    employee.setEmail(email);
                }

                else {
                    age = Integer.parseInt(tokens[4]);
                    employee.setAge(age);
                }
            }

            else if (tokens.length == 6){
                email = tokens[4];
                employee.setEmail(email);

                age = Integer.parseInt(tokens[5]);
                employee.setAge(age);
            }

            department.addEmployee(employee);


        }

        Department highestPaidDepartment = Department.getDepartmentWithHighestAverageSalary(departments);

        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());
        highestPaidDepartment.printEmployeesByHighestSalary();
    }
}
