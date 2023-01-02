package designPattern.factory;

import java.util.Scanner;

public class PaymentService {
    public static void main(String ...args){
        PaymentFactory paymentFactory = new PaymentFactory();
        Scanner input = new Scanner(System.in);
        System.out.println("Select the payment method");
        System.out.println("1. Net Banking\n2. Debit Card\n3. Credit Card");
        int choice = input.nextInt();
        Payment payment = null;
        switch(choice){
            case 1:
                payment = paymentFactory.createPayment("NetBanking");
                break;
            case 2:
                payment = paymentFactory.createPayment("Debit");
                break;
            case 3:
                payment = paymentFactory.createPayment("Credit");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }
        payment.pay(20000);
    }
}
