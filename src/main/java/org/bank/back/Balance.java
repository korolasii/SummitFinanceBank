package org.bank.back;
import java.util.HashMap;
public class Balance {
    protected static HashMap<String, Integer> balance = new HashMap<>();

    public static int getBalance(String name){
        if (balance.containsKey(name)) {
            return balance.get(name);
        } else {
            balance.put(name, 0);
            return balance.get(name);
        }
    }
}