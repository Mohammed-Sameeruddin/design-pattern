package designPattern.employeeManagement;

import java.util.List;

public abstract class BaseAlgorithm {

    public abstract List<Employee> getEmployees();

    public abstract Requirement getRequirement();

    public abstract void process(List<Employee> employees, Requirement requirement);

    public void load() {
        List<Employee> employees = getEmployees();
        Requirement requirement = getRequirement();
        process(employees,requirement);
    }
}
