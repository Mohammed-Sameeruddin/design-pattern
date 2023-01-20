package designPattern.employeeManagement;

public class Main {

    public static void main(String ...args){
        BaseAlgorithm matchEmployees = new MatchEmployee();
        BaseAlgorithm allocateEmployees = new AllocateEmployee();
        matchEmployees.load();
        allocateEmployees.load();
    }
}
