package designPattern.visitor;

public class Withdrawal implements Transaction{
    @Override
    public void accept(BankVisitor visitor) {
        visitor.visit(this);
    }
}
