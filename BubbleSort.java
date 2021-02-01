public class BubbleSort {

    public static void main(String[] args){

        int[] dataSet1 = {2,3,5,4,6,8,5,9,1};
        BubbleSort s = new BubbleSort();
        int[] result = s.sort(dataSet1);
        System.out.println("TESTE");
        System.out.println(java.util.Arrays.toString(result));

    }
    

    public int[] sort (int[] dataSet) {

        for(int i = dataSet.length -1; i >= 0; i--){
            for(int j = 0; j <= i - 1; j++){
                if(dataSet[j] > dataSet[j+1]){
                    int temp = dataSet[j];
                    dataSet[j] = dataSet[j+1];
                    dataSet[j+1] = temp;
                }
            }
        }
        return dataSet;


    }
    
}
