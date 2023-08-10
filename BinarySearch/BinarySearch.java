package binarysearch;

public class BinarySearch {
    public static int findIndex(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={3,4,13,23,34,55,60};
        int key=13;
        int index=findIndex(arr,key);
        if(index==-1){
            System.out.println("Key Element not Found");
        }
        else{
            System.out.println("Key Element found at the index "+index);
        }
    }
}
