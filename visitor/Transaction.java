package designPattern.visitor;

public interface Transaction {
    public void accept(BankVisitor visitor);
}
