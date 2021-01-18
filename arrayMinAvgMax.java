public class arrayMinAvgMax {

    public static void main(String[] args){
        int[] n = {1,2,3,4};
        arrayMinAvgMax s = new arrayMinAvgMax();

        int[] result = s.maximo(n);
        System.out.println("TESTE - máximo");
        System.out.println(java.util.Arrays.toString(result));


        int[] result2 = s.minimo(n);
        System.out.println("TESTE - mínimo");
        System.out.println(java.util.Arrays.toString(result2));

        float[] m = {1,2,3,4};
        float[] result3 = s.avarage(m);
        System.out.println("TESTE - média");
        System.out.println(java.util.Arrays.toString(result3));

    }
    

    public int[] maximo(int[] arr) {

        int[] maxi = {arr[0]};

        for (int i=0; i < arr.length; i++){
            if (arr[i] > maxi[0]){
                maxi[0] = arr[i];
            }
        }      
        return maxi;
    }


    public int[] minimo(int[] arr) {

        int[] mini = {arr[0]};

        for (int i=0; i < arr.length; i++){
            if (arr[i] < mini[0]){
                mini[0] = arr[i];
            }
        }      
        return mini;
    }

    public float[] avarage(float[] arr) {

        float[] sum = {0};
        float[] res = {0};

        for (int i=0; i < arr.length; i++){
            
            sum[0] = sum[0] + arr[i];
        } 
        res[0] = sum[0]/arr.length;

        return res;
    }
    
}
