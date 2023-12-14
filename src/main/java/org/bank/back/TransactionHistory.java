package org.bank.back;

import java.util.ArrayList;

public class TransactionHistory extends Transaction{
    private String date;
    ArrayList<String> history = new ArrayList<>();
    TransactionHistory(String type, float amount, String sender, String adress, String date) {
        super(type, amount, sender, adress);
        this.date=date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void recordTransaction(){
        String str = "User: "+getSender()+" sent "+getAmount()
                +"$ to: "+getAdress()+". Type of transaсtion: "+getType()
                + "Data: "+getDate();
        history.add(str);
    }
}