package designPattern.visitor;

public class BankVisitorImpl implements BankVisitor{
    @Override
    public void visit(Deposit deposit) {
        System.out.println("Deposit money into the bank");
    }

    @Override
    public void visit(Withdrawal withdrawal) {
        System.out.println("Withdraw money from the bank");
    }
}
