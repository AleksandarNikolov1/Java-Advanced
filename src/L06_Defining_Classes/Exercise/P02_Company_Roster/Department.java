package L06_Defining_Classes.Exercise.P02_Company_Roster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    private double getAverageSalary(List<Employee> employees) {
        double sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        return sum / employees.size();
    }

    public static Department getDepartmentWithHighestAverageSalary(List<Department> departments) {
        double maxAvgSalary = 0;

        Department department = null;

        for (Department dep : departments) {
            if (maxAvgSalary < dep.getAverageSalary(dep.getEmployees())) {
                maxAvgSalary = dep.getAverageSalary(dep.getEmployees());
                department = dep;
            }
        }

        return department;
    }

    public String getName() {
        return name;
    }

    public void printEmployeesByHighestSalary(){
        this.employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(e -> System.out.printf("%s %.2f %s %d%n", e.getName(),
                        e.getSalary(), e.getEmail(), e.getAge()));
    }
}
