package binarysearch;
public class RecursiveBinary {
    public static int findKey(int arr[],int key,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            return findKey(arr,key,start,mid-1);
        }
        else {
            return findKey(arr,key,mid+1,end);
        }

    }
    public static void main(String[] args) {
        int []arr={4,5,13,23,45,66};
        int key=45;
        int index=findKey(arr,key,0,arr.length-1);
        if(index==-1){
            System.out.println("Key Element not Found");
        }
        else{
            System.out.println("Key Element found at the index "+index);
        }
    }
}
