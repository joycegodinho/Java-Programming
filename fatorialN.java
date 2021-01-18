public class fatorialN {

    public static void main(String[] args){
        int n = 0;
        fatorialN s = new fatorialN();
        int result = s.fatorial(n);
        System.out.println("TESTE");
        System.out.println(result);

    }
    

    public int fatorial(int n) {

        int fat = 1;

        while (n > 1){
            fat = fat*n;
            n = n - 1;
        }      
        return fat;
    }
    
}
