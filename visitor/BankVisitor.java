package designPattern.visitor;

public interface BankVisitor {
    public void visit(Deposit deposit);
    public void visit(Withdrawal withdrawal);
}
