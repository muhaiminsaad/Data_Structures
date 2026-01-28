public class SelectionSort{
    public static void main(String[] args) {
        int[] array={15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};

        for(int i=0;i<array.length-1;i++){ //array.length-1 bcz the last element be already sorted after those iterations.
                                           //also, the last element wouldn't have any element next to it to compare with.
            int min=i;

            for(int j=i+1;j<array.length;j++){ //j=i+1 bcz we compare i with it's next index element.
                if(array[min]>array[j])
                    min=j;
            }
            int temp=array[i];  //swapping
            array[i]=array[min];
            array[min]=temp;
        }
        for(int x:array){
            System.out.print(x+" ");
        }
    }
}
