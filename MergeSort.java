import java.util.Arrays;

public class MergeSort {
  
    static void merge(int arr[], int si, int mid, int ei) {
        int arr1[] = new int[mid - si + 1];
        
        int k = 0;
        for(int i = si; i <= mid; i++) {
            arr1[k] = arr[i];
            k++;
        }
        
        int arr2[] = new int[ei - mid];
        
        k = 0;
        
        for(int i = mid+1; i <= ei; i++) {
            arr2[k] = arr[i];
            k++;
        }
        
        int i = 0, j = 0;
        k = si;
        
        
        while(i < arr1.length && j < arr2.length) {
            
            
            if(arr1[i] < arr2[j]) {
                
                arr[k] = arr1[i];
                i++;
                k++;
            }else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
            
        }
        
        // first array is finsih
        while(j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        
        // second array is finsh
        
        while(i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        
        
    }
    
    
    static void mergeSort(int arr[],int si, int ei) {
        
        // base case 
        
        // if(si >= ei) {
        //     return ;
        // }
        
        if(si < ei) {
        
        
                int mid = (si + ei) / 2;
                //System.out.println(si+" "+ei+" "+mid);
                mergeSort(arr, si, mid);
                mergeSort(arr, mid + 1, ei);
                
                merge(arr, si, mid, ei);
        
        }
        
    }
    
    
    public static void main(String args[]) {
      
       int arr[] = {54, 656, 12, 33, -1, 90};
       
       mergeSort(arr, 0, 5);
       
       System.out.println(Arrays.toString(arr));
    }
}
