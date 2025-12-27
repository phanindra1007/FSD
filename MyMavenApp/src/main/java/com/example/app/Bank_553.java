package com.example.app;
class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

public class Bank_553 {

    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getInterestRate() + "%");
    }
}
