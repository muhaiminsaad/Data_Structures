public class MergeSort {
    public static void main(String[] args) {
        int[] data={45,23,11,78,432,13,97,58};
        Sort.MergeSort(data);

        for(int x:data){
            System.out.print(x+" ");
        }
    }
    //this is the entry point for merge sorting, and it should not be private
    static void MergeSort(int[] array){
        int length=array.length;
        //halting condition of recursion
        if(length<=1){
            return;
        }
        int mid=length/2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[length-mid];

        int i=0,j=0;

        for(;i<length;i++){
            if(i<mid){
                leftArray[i]=array[i];
            }
            else{
                rightArray[j++]=array[i];
            }
        }

        //Display splitting of arrays in each recursion>>
        /*
        for(int x: leftArray){
            System.out.print(x+" ");
        }

        System.out.print("| ");

        for(int y: rightArray){
            System.out.print(y+" ");
        }
        System.out.println("");
        */

        MergeSort(leftArray);
        MergeSort(rightArray);
        Merge(leftArray,rightArray,array);
    }
    //Helper methods should be private, entry-point methods (MergeSort) should not be private
    //Merge() is a part of MergeSort(), so running Merge() makes no sense
    private static void Merge(int[] leftArray,int[] rightArray,int[] array){
        int leftSize=leftArray.length;
        int rightSize=rightArray.length;

        int i=0,l=0,r=0;

        while(l<leftSize && r<rightSize){
            if(leftArray[l]<=rightArray[r]){
                array[i++]=leftArray[l++];
            }
            else{
                array[i++]=rightArray[r++];
            }
        }
        while(l<leftSize){
            array[i++]=leftArray[l++];
        }
        while(r<rightSize){
            array[i++]=rightArray[r++];
        }
    }
}
