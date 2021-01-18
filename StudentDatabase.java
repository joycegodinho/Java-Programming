public class StudentDatabase {

    public static void main(String[] args){
        Database std1 = new Database("Joyce","653487627");
        
        String[] materias = {"Cálculo", "Física 1", "ICC"};
        std1.enroll(materias);
        System.out.println(java.util.Arrays.toString(std1.showCourses()));

        std1.credito(1000);
        std1.pay(500);
        
        System.out.println(std1.toString());

    }
    
}

class Database{
    // Variáveis
    private String name;
    private String SSN;
    private String email;
    private static String iD;
    private double balance;
    private String city;
    private String state;
    private int phone;
    private String[] materias;

    //Construtor
    public Database (String name, String SSN) {

        this.name = name;
        this.SSN = SSN;

        setEmail();
        setID();

    }

    private void setEmail(){

        email = name.toLowerCase() + "@email.com";
        System.out.println("Seu email: " + email);

    }

    private void setID(){

        int random = (int) (Math.random()*10000);
        iD = random + SSN.substring(5);
        System.out.println("Seu iD: " + iD);

    }
    /// set and get materias ////////
    public void enroll(String[] materias){

        this.materias = materias;

    }

    public String[] showCourses(){
        return materias;
    }
    ///////////////////////////////

    public void credito(double cred){
        System.out.println("Crédito de: " + cred);
        balance = cred;
        checkBalance();
    }

    public void pay(double amount){
        System.out.println("Pagando: " + amount);
        balance = balance - amount;
        checkBalance();
    }

    public void checkBalance(){
        System.out.println("Balance: " + balance);
    }

    @Override
    public String toString(){
        return "[Nome: " + name + "]\n" + "[email: " + email + "]\n" + "[iD: " + iD + "]\n" + "[Balance: " + balance + "]";
    }
}
