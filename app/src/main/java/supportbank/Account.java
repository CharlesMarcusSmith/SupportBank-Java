package supportbank;

public class Account {
    String name;
    double balance;

    public Account (String name){
        this.name = "name";
        balance = 0.00;
    }
    public void addAmount(double amount){
        balance -= amount;
    }
    public void deductAmount(double amount){
        balance += amount;
    }

}
