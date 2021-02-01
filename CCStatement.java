import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CCStatement {
    
    public static void main(String[] args){

        List<String[]> data = new ArrayList<String[]>();
        String filename = "C:\\Users\\joyce\\OneDrive\\Documentos\\ccStatment.csv";
        String dataRow = null;
        double balance = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while ((dataRow  = br.readLine()) != null) {
                String[] line = dataRow.split(",");
                data.add(line);
			}		
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: file not found");
		} catch (IOException e) {
			System.out.println("Error: could not read file");
		}

		for (String[] collum : data) {
            String type = collum[1];
            double amount = Double.parseDouble(collum[3]);

            if(type.equals("CREDIT")){
                balance = balance + amount;

            }
            else{
                balance = balance - amount;

            }
            //System.out.println(balance);	
        }
        if (balance > 0){
            double fee = balance * .1;
            System.out.println("Balance of " + balance);
            System.out.println("Charged fee of " + fee);
        }
        else if( balance == 0 ){
            System.out.println("Balance of " + balance);
            System.out.println("Thanks for your payments");
        }
        else {
            System.out.println("Overpayment of -" + balance);
            System.out.println("Thanks for your payments");
        }


    }
}
