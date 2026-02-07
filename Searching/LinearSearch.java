public class LinearSearch{
    public static void main(String[] args){
        int[] data={1,2,7,4,5,6,7,8,9,7};
        LinearSearch(data,7);
    }

    static void LinearSearch(int[] array,int key){
        boolean isFound=false;
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.println("Found at position "+(i+1));
                isFound=true; //shows multiple occurrences.
                //use break; here to show only one occurrence.
            }
        }
        if(!isFound){
            System.out.println("Not found");
        }
    }
}
