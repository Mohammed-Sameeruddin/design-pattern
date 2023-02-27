package designPattern.visitor;

public class Deposit implements Transaction{
    @Override
    public void accept(BankVisitor visitor) {
        visitor.visit(this);
    }
}
