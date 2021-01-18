public class somaN {

    public static void main(String[] args){
        int n = 4;
        somaN s = new somaN();
        int result = s.soma(n);
        System.out.println("TESTE");
        System.out.println(result);

    }
    

    public int soma(int n) {

        int sum = 0;

        for (int i=1; i <= n; i++){
            sum = sum + i;
        }      
        return sum;
    }
    
}
