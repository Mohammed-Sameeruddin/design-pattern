package designPattern.visitor;

public class Main {

    public static void main(String ...args){
        Transaction depositTransaction = new Deposit();
        Transaction withdrawTransaction = new Withdrawal();

        BankVisitor bankVisitor = new BankVisitorImpl();
        depositTransaction.accept(bankVisitor);
        withdrawTransaction.accept(bankVisitor);
    }
}
