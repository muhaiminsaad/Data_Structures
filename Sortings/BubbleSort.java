public class BubbleSort {
    public static void main(String[] args) {
        int[] array={23,12,78,9,40,21};
        int temp;

        for(int i=0;i<array.length-1;i++){ //After each outer pass, the largest element is already placed at the end, so we don’t need to check it again.
                                           //using array.length doesn't make sense as the last element in each iteration needs no check.
            
          for(int j=0;j<array.length-1;j++){ //When j == array.length - 1, array[j+1] becomes -> array[array.length] → ArrayIndexOutOfBoundsException
                if(array[j]>array[j+1])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.print("Sorted array: ");

        for(int x:array){
            System.out.print(x+" ");
        }
    }
}
