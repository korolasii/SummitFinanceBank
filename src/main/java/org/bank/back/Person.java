package org.bank.back;

public class Person {
    public static String name;

    public static int balance(){
        return Balance.getBalance(name);
    }
}
