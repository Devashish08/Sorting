import java.util.*;
public class SelectionSort {
    static void selectionSort(int arr[],int n){
        for(int i= 0;i<n-1;i++){
            int si = i;
            for(int j =i+1;j<n;j++){
                if(arr[si]>arr[j]){
                    si =j;
                }
            }
            int temp = arr[si];
            arr[si] = arr[i];
            arr[i]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
        public static void main(String[] args){
            int arr[]= {54,656,12,33,-1,90};
            selectionSort(arr, 6);
    }
}
