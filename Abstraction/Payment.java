package Abstraction;

abstract class Payment {
    void initiatePayment(){
        System.out.println("Initiating Transaction.");
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment{
    @Override
    void processPayment(){
        System.out.println("Processing Credit Card Payment");
    }
}

class UPIPayment extends Payment{
    @Override
    void processPayment(){
        System.out.println("Processing Payment with UPI");
    }
}

class NetBankingPayment extends Payment{
    @Override
    void processPayment(){
        System.out.println("Processing Payment with NetBanking");
    }
}