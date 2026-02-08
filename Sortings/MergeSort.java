public class MergeSort {
    public static void main(String[] args) {
        int[] data={12,1,35,44,21,56,23,80,64};
        MergeSort(data);

        for(int x:data){
            System.out.print(x+" ");
        }
    }

    static void MergeSort(int[] array){
        int length=array.length;
        if(length<=1){
            return;
        }
        int mid=length/2;
        int[] leftArray= new int[mid];
        int[] rightArray= new int[length-mid];

        int i=0,j=0;

        for(;i<length;i++){
            if(i<mid){
                leftArray[i]=array[i];
            }
            else{
                rightArray[j]=array[i];
                j++;
            }
        }
        MergeSort(leftArray);
        MergeSort(rightArray);
        Merge(leftArray,rightArray,array);
    }

    static void Merge(int[] leftArray,int[] rightArray,int[] array){
        int leftSize=leftArray.length;
        int rightSize=rightArray.length;

        int i=0,l=0,r=0;

        while(l<leftSize && r<rightSize){
            if(leftArray[l]<rightArray[r]){
                array[i]=leftArray[l];
                l++;
            }
            else{
                array[i]=rightArray[r];
                r++;
            }
            i++;
        }
        while(l<leftSize){
            array[i]=leftArray[l];
            i++;
            l++;
        }
        while(r<rightSize){
            array[i]=rightArray[r];
            i++;
            r++;
        }
    }
}
