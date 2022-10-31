import java.util.Arrays;
public class InsertionSort{
 
 static void insertionSort(int arr[],int n){
    for(int i = 1;i<n;i++){
        for(int j = i;j>0;j--){
            if(arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }else{
                break;
            }
        }
    }
System.out.println(Arrays.toString(arr));
 }
    
    public static void main(String[] args){
        int arr[]= {54,656,12,33,-1,90};
        insertionSort(arr, 6);
    }
}