
public class BankAccountApp {

    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("465329874", 1000.50);
        BankAccount acc2 = new BankAccount("235764892", 2000);
        BankAccount acc3 = new BankAccount("859689523", 2500);

        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.payBill(1000);
        System.out.println(acc1.toString());

    }
    
}

class BankAccount{
    // propriedades do bank account
    // private para encapsular as informações - só fica disponível nessa classe
    //static - variável da classe e não do objeto. Podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto

    private static int iD = 1000; // Internal iD para identificação do banco. Static para que essa propriedade pertença a classe e não a uma pessoa em particular
    private String accountNumber; // iD + random 2-digit number + first 2-digit of SSN
    private static final String routingNumber = "005400657"; //final transforma em constante
    private String name;
    private String SSN; // social security number
    private double balance; //long float

    public BankAccount(String SSN, double initDeposit){
        //construtor
        // usa o SSN para gerar um número de conta
        balance = initDeposit;
        this.SSN = SSN;
        iD++; // incrementa o iD a cada conta criada
        setAccountNumber(); //será chamada instataneamente pois está no construtor
    }

    private void setAccountNumber(){
        // privado pq vai ser gerado automaticamente pelo backend, não podendo ser
        // definido pelo cliente
        // void - sem return 

        int random = (int) (Math.random()*100); // retorna um número entre 0 e 1, por isso x100. 
                                       //Retorna um double, por isso (int)
        accountNumber = iD + "" + random + SSN.substring(0, 2);
        System.out.println("Your Account Number: " + accountNumber);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void payBill(double amount){
        System.out.println("Paying bill: " + amount);
        balance = balance - amount;
        showBalance();
    }

    public void makeDeposit(double amount){
        System.out.println("Making deposit: " + amount);
        balance = balance + amount;
        showBalance();
    }

    public void showBalance(){
        System.out.println("Balance: " + balance);
    }

    @Override
    public String toString(){
        return "[Name: " + name + "]\n" + "[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
    }


}
