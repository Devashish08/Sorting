import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Queue1 {
    static void revUsingQue(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int curr = q.remove();
        revUsingQue(q);
        q.add(curr);
    }

    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q);
        // revUsingQue(q);
        // System.out.println(q);
        // int arr[] = new int[q.size()];
        // int i = 0;
        // while(!q.isEmpty()){
        // int curr = q.remove();
        // arr[i] = curr;
        // i++;
        // }
        // for(i=arr.length - 1;i>=0;i--){
        // q.add(arr[i]);
        // }
        // System.out.println(q);
        int arr[] = new int [12];
        Scanner S = new Scanner(System.in);
        for(int i = 0;i< 12; i++) arr[i] = S.nextInt();
        for(int i = 0; i<12;i++){
            int curr = arr[i];
            int cnt = 0;
            for(int j =i;j>=0;j--){
             if(curr >= arr[j]){
                cnt--;
             }else{
                break ;
             }
            }
            System.out.print(cnt+" ");
        }
    }
}
