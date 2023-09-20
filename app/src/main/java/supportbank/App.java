package supportbank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    private static BankingSystem bs = new BankingSystem();

    public static void main(String[] args) {
        //Read Files --/
        //Create Account Object For Storage --/
        //Store to Hash Map --/
        //Ask user for input --/
        //List their selected option --/

        readFile("/home/charles/Documents/Bootcamp/SupportBank-Java/Transactions2014.csv");

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




    //FILE READER METHODS===================================================================================
    //Reads file, then passes to assembly method a record at a time
    public void readFile(String csvFile){
		String[] transaction = new String[5];
        String delimiter = ",";

        try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";

         while((line = br.readLine()) != null) {
            transaction = line.split(delimiter);
            unpack(transaction);
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
	}

    public void unpack(String[] transaction){
        String date = transaction[0].trim();
        String sender = transaction[1].trim();
        String recipient = transaction[2].trim();
        String context = transaction[3].trim();
        String amount = transaction[4].trim();
        

        bs = new BankingSystem();
        bs.addAccount(sender);
        bs.addAccount(recipient);
    }
}


