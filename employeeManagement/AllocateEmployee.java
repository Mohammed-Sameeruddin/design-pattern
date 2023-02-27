package designPattern.employeeManagement;

import java.util.ArrayList;
import java.util.List;

public class AllocateEmployee extends BaseAlgorithm{
    @Override
    public List<Employee> getEmployees() {
        // Getting Employees will Full Match from DB
        List<String> skills2 = new ArrayList<>();
        skills2.add("SpringBoot");
        Employee employee2 = new Employee(2,"John", skills2);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee2);
        return employees;
    }

    @Override
    public Requirement getRequirement() {
        // Getting the requirement from the db aginst which we need to allocate the employee
        List<String> skills = new ArrayList<>();
        skills.add("SpringBoot");
        return new Requirement(101, "Backend", skills);
    }

    @Override
    public void process(List<Employee> employees, Requirement requirement) {
        // save the employees as allocated against a particular requirement
        requirement.setEmployees(employees);
        System.out.println("Employees allocated for a particular requirement");
        employees.forEach(employee -> System.out.println("Employee " + employee.getEmployeeId() + " " + employee.getEmployeeName()));
    }
}
