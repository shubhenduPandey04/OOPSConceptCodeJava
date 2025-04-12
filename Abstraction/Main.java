package Abstraction;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n=== CreditCard Actions ===");
        Payment p1 = new CreditCardPayment();
        p1.initiatePayment();
        p1.processPayment();

        System.out.println("\n=== UPI Actions ===");
        Payment p2 = new UPIPayment();
        p2.initiatePayment();
        p2.processPayment();

        System.out.println("\n=== NetBanking Actions ===");
        Payment p3 = new NetBankingPayment();
        p3.initiatePayment();
        p3.processPayment();
    }
}
