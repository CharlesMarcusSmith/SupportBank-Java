package supportbank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TransactionReader {
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
            BankingSystem bs = new BankingSystem();
            bs.unpack(transaction);
            
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
	}
}
