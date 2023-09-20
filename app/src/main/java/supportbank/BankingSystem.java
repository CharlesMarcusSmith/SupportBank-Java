package supportbank;

import java.util.HashMap;

public class BankingSystem {
    public HashMap<String, Account> accounts = new HashMap<>(); 

    public void addAccount(String name){
        accounts.putIfAbsent(name, new Account(name));
    }

    public void makeTransaction(String sender, String recipient, double amount){
        accounts.get(sender).deductAmount(amount);
        accounts.get(recipient).addAmount(amount);
    }

    public void listAll(){
        for(Account account : accounts.values()) {
            System.out.println(account);
        }
    }


}
