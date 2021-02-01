public class LinearSearch {

    public static void main(String[] args){
        int target1 = 0;
        int[] dataSet1 = {1,2,3,4,0};
        LinearSearch s = new LinearSearch();
        int result = s.search(dataSet1, target1);
        System.out.println("TESTE");
        System.out.println(result);

    }
    

    public int search (int[] dataSet, int target) {

        for(int i = 0; i < dataSet.length; i++){
            if(dataSet[i]==target){
                return i;  
            };
        }
        return -1;


    }
    
}
