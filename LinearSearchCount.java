import java.util.*;
 class LinearSearchCount {
   public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
       int count = 0;
       for(int i=0;i<inputArr.length;i++) {
           if(inputArr[i] == key) {
               return count;
           }
           count++;
       }
       return count;
   }

   public static void main(String args[] ) throws Exception {
       LinearSearchCount ls = new LinearSearchCount();
       Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();
       int array[] = new int[size];
       for (int i = 0; i < size; i++) {
           array[i] = scanner.nextInt();
       }
       int key = scanner.nextInt();
       System.out.println(ls.getLinearSearchUnsuccessfulComparisonCount(array, key));
   }
}
