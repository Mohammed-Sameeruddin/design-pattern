package designPattern.employeeManagement;

import java.util.List;

public class Employee {

    public int employeeId;
    public String employeeName;
    public List<String> skills;

    public double availabilityPercent;

    Employee(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    Employee(int employeeId, String employeeName, List<String> skills){
        this(employeeId, employeeName);
        this.skills = skills;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public double getAvailabilityPercent() {
        return availabilityPercent;
    }

    public void setAvailabilityPercent(double availabilityPercent) {
        this.availabilityPercent = availabilityPercent;
    }
}
