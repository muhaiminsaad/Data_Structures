public class InsertionSort{
    public static void main(String[] args){
        int[] array={34,56,8,21,14,52};  //imaginary dividing of this array into sorted and unsorted part.
        //the first element is considered already sorted, so it's inside the sorted part {34 | 56,8,21,14,52}

        for(int i=1;i<array.length;i++){ //index starts from 1 bcz the first element of array is considered sorted.
            int key=array[i];            //holds the first element from the unsorted part.
            int j=i-1;                   //j to track the element exactly before index i.
            while(j>=0 && array[j]>key){ //used while loop to compare the elements inside the sorted part with the key value.
                                         //for loop not suitable bcz we need to work with the value of j after this loop block.
                                         //if j was used in for loop, it's scope would be only for that for loop!
                array[j+1]=array[j];
                j--;                     //decrementing bcz comparison going backwards.
            }
            array[j+1]=key;              //after the while loop, we always get j=-1, then j+1 is 0, so we place the key value in 1st position. 
        }
        for(int x:array){
            System.out.print(x+" ");
        }
    }
}
