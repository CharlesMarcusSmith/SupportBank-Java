package supportbank;

import java.util.Scanner;

public class App {
    private static BankingSystem bs = new BankingSystem();

    public static void main(String[] args) {
        //Read Files --/
        //Create Account Object For Storage --/
        //Store to Hash Map --/
        //Ask user for input --/
        //List their selected option --/

        TransactionReader tr = new TransactionReader();
        tr.readFile("/home/charles/Documents/Bootcamp/SupportBank-Java/Transactions2014.csv");

        System.out.println("Please select from the following two options:");
        System.out.println("1: To search all users, please enter 'ListAll.'");
        System.out.println("2: To list all transactions listen on an account,");
        System.out.println("please type 'List [account name].");
        System.out.println("For example 'List John W.");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if(userInput.equals("ListAll")){
            bs.listAll();
        }
        scanner.close();
    }
    }


