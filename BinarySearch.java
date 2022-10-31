public class BinarySearch{
    static  boolean binarySearch(int arr[],int x){
        int si = 0;
        int ei = arr.length - 1;
        while(si<ei){
            int mid = si+(ei-si)/2;
            if(arr[mid]==x){
                return true;
            }
            else if(arr[mid]<x){
                si = mid +1;
            }
            else{
                ei = mid -1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[]= {10,20,30,40,60,90};
        int x = 10;
        boolean isPresent =binarySearch(arr, x);
        if(isPresent){
            System.out.println("Element is Present");
        }
        else{
            System.out.println("Elememt is Not Present");
        }
    }
}