import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ValidPassword {
	public static void main(String[] args) {
		
		String filename = "C:\\Users\\joyce\\OneDrive\\Documentos\\passwords.txt";
		File file = new File(filename);
		String [] pass = new String[10];
		String eachPass = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for(int i = 0; i < pass.length; i++ ) {
				pass[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: file not found");
		} catch (IOException e) {
			System.out.println("Error: could not read file");
		}
		
		// valid password
			// a number
			// a letter
			// special character
		
		for(int i = 0; i < pass.length; i++ ) {
			eachPass = pass[i].toLowerCase();
			try {
			
				if(!(eachPass.contains("!")
					|| eachPass.contains("@")
					|| eachPass.contains("#")
					|| eachPass.contains("*") 
					|| eachPass.contains("&")
					|| eachPass.contains("%")
					|| eachPass.contains(".")
					|| eachPass.contains(",")
					|| eachPass.contains(":") 
					|| eachPass.contains(";")
					|| eachPass.contains("(")
					|| eachPass.contains(")")
					|| eachPass.contains("{")
					|| eachPass.contains("}") 
					|| eachPass.contains("?")
					|| eachPass.contains("/")
					|| eachPass.contains("+")
					|| eachPass.contains("-")
					|| eachPass.contains("=") 
					|| eachPass.contains("$")
					|| eachPass.contains("_"))) {
						
					throw new SpecialCharacterException (eachPass);					
				}	
				
				if(!(eachPass.contains("0")
					|| eachPass.contains("1")
					|| eachPass.contains("2")
					|| eachPass.contains("3") 
					|| eachPass.contains("4")
					|| eachPass.contains("5")
					|| eachPass.contains("6")
					|| eachPass.contains("7")
					|| eachPass.contains("8") 
					|| eachPass.contains("9"))) {
					throw new NumberException (eachPass);		
				}
				
				if(!(eachPass.contains("a")
					|| eachPass.contains("b")
					|| eachPass.contains("c")
					|| eachPass.contains("d") 
					|| eachPass.contains("e")
					|| eachPass.contains("f")
					|| eachPass.contains("g")
					|| eachPass.contains("h")
					|| eachPass.contains("i") 
					|| eachPass.contains("j")
					|| eachPass.contains("k")
					|| eachPass.contains("l")
					|| eachPass.contains("m")
					|| eachPass.contains("n") 
					|| eachPass.contains("o")
					|| eachPass.contains("p")
					|| eachPass.contains("q")
					|| eachPass.contains("r")
					|| eachPass.contains("s") 
					|| eachPass.contains("t")
					|| eachPass.contains("u")
					|| eachPass.contains("v")
					|| eachPass.contains("x")
					|| eachPass.contains("z")
					|| eachPass.contains("w") 
					|| eachPass.contains("y"))) {
					throw new LetterException (eachPass);	
				}		
				System.out.println("Password meet the criteria");
				
			}catch (SpecialCharacterException e) {
				System.out.println("Error: Password do not contain a special character");
				System.out.println(e.toString());
			} catch (NumberException e) {
				System.out.println("Error: Password do not contain a number");
				System.out.println(e.toString());
			} catch (LetterException e) {
				System.out.println("Error: Password do not contain a letter");
				System.out.println(e.toString());
			}			
		}
	}
}

class SpecialCharacterException extends Exception{	
	String pass;
	SpecialCharacterException(String pass){
		this.pass = pass;	
	}	
	public String toString() {
		return "SpecialCharacterException: " + pass;
	}	
}

class NumberException extends Exception{	
	String pass;
	NumberException(String pass){
		this.pass = pass;	
	}	
	public String toString() {
		return "NumberException: " + pass;
	}	
}

class LetterException extends Exception{	
	String pass;
	LetterException(String pass){
		this.pass = pass;	
	}	
	public String toString() {
		return "LetterException: " + pass;
	}	
}
