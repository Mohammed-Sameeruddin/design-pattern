package designPattern.employeeManagement;

import java.util.ArrayList;
import java.util.List;

public class MatchEmployee extends BaseAlgorithm{
    @Override
    public List<Employee> getEmployees() {
        // Getting Employees from the database with their skills
        List<String> skills1 = new ArrayList<>();
        skills1.add("React");
        List<String> skills2 = new ArrayList<>();
        skills2.add("SpringBoot");
        Employee employee1 = new Employee(1,"Smith", skills1);
        Employee employee2 = new Employee(2,"John", skills2);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        return employees;
    }

    @Override
    public Requirement getRequirement() {
        // Getting the requirement from the db
        List<String> skills = new ArrayList<>();
        skills.add("SpringBoot");
        return new Requirement(101, "Backend", skills);
    }

    @Override
    public void process(List<Employee> employees, Requirement requirement) {
        // save employee to db who matches with the requirement skills
        List<String> skills = requirement.getSkills();
        employees.forEach(employee -> {
            List<String> employeeSkills = employee.getSkills();
            employeeSkills.forEach(skill -> {
                if(skills.contains(skill)){
                    System.out.println("Full Match Found");
                    System.out.println("Employee: " + employee.getEmployeeId() + " " + employee.getEmployeeName());
                }
            });
        });
    }
}
