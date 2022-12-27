import java.util.*;
public class Sorting2dArray {

    public static void main(String[] args) {
        int arr[] [] = {
            {0,1},{3,3},{2,0}
        };
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
    
}
