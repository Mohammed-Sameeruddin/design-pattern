package designPattern.factory;

import java.util.Scanner;

public class PaymentService {
    public static void main(String ...args){
        PaymentFactory netBankingFactory = new NetBankingFactory();
        PaymentFactory creditFactory = new CreditFactory();
        PaymentFactory debitFactory = new DebitFactory();
        PaymentFactory upiFactory = new UPIPaymentFactory();
        Scanner input = new Scanner(System.in);
        System.out.println("Select the payment method");
        System.out.println("1. Net Banking\n2. Debit Card\n3. Credit Card\n4. UPI");
        int choice = input.nextInt();
        Payment payment = null;
        switch(choice){
            case 1:
                payment = netBankingFactory.createPayment("NetBanking");
                break;
            case 2:
                payment = debitFactory.createPayment("Debit");
                break;
            case 3:
                payment = creditFactory.createPayment("Credit");
                break;
            case 4:
                payment = upiFactory.createPayment("UPI");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }
        payment.pay(20000);
    }
}
