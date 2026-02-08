public class BinarySearch{
    public static void main(String[] args){
        int[] data={1,2,4,6,7,8,9};
        BinarySearch(data,8);
    }

    static void BinarySearch(int[] array,int key){
        int head=0, tail=array.length-1;
        boolean isFound=false;

        while(head<=tail){
            int mid=(head+tail)/2;

            if(array[mid]==key){
                isFound=true;
                System.out.println("Found! Position: "+(mid+1));
                break; //if break not used, the while loop keeps on running even after finding the element.
                //and using binary search, we can find single occurrence of the element.
            }
            else if(array[mid]<key){
                head=mid+1;
            }
            else{
                tail=mid-1;
            }
        }

        if(!isFound){
            System.out.println("Not Found!");
        }
    }
}
