package supportbank;

public class Account {
    String name;
    double balance;//Amount is null so we will have to set it on construction

    //Blank constructor
    public Account(){
    name.equals("nameless");
    balance = 0.00;
    }

    //Name only constructor
    public Account(String inName){
    this.name = inName;
    balance = 0.00;
    }

    //Complete constructor
    public Account(String inName, double inBalance){
    this.name = inName;
    this.balance = inBalance;
    }


    //Getters
    public String getName() {
        return name;
    }

    public double getAmount() {
        return balance;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(double balance) {
        this.balance = balance;
    }

    //Amount Edits
    public void deductAmount(double inAmount){
        balance = balance - inAmount;
    }

    public void addAmount(double inAmount){
        balance = balance + inAmount;
    }
    
}

