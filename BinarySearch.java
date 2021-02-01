public class BinarySearch {

    public static void main(String[] args){
        int target1 = 0;
        int[] dataSet1 = {1,2,3,4,5,6,7,8,9};
        LinearSearch s = new LinearSearch();
        int result = s.search(dataSet1, target1);
        System.out.println("TESTE");
        System.out.println(result);

    }
    

    public int search (int[] dataSet, int target) {
        int first = 0;
        int last = dataSet.length -1;
        boolean find = false;
        int middle = (int) Math.floor((first+last)/2);;
        int res = -1;

        while ((first <= last) &&! find){
            if(dataSet[middle] == target){
                find = true;
                res = middle;
            }
            else if(target < dataSet[middle]){
                last = middle -1;
            }
            else {
                first = middle + 1;
            }
        }
        return res;

    }
    
}
