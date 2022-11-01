/*public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        //This is the default value if the key is not found in the array.
        return -1;
    }

    public static void main(String a[]) {

        int[] arr1 = {23, 45, 21, 55, 234, 1, 34, 90};
        int searchKey = 34;
        System.out.println("Key " + searchKey + " found at index: " + linearSearch(arr1, searchKey));
        int[] arr2 = {123, 445, 421, 595, 2134, 41, 304, 190};
        searchKey = 421;
        System.out.println("Key " + searchKey + " found at index: " + linearSearch(arr2, searchKey));
    }
}
*/

//Second Problem In linear Search
// Description
// Given an array of non-negative integers, write a code to search the position of an element in the array in the reverse order. Do not print anything when the element is not present in the given array.
// Also, if the key is repeated, print the index where the key is appearing for the first time in reverse order.

// The code should :
// Take the size of the array as an input from the user.
// The elements of the array as an input from the user.
// The key you are searching for, as an input from the user.

import java.util.Scanner;

public class LinearSearch {
   public static void main(String args[]) {
       int count;
       int i;
       
       Scanner input = new Scanner(System.in);
       count = input.nextInt();
       int array[] = new int[count];
       
       for (i = 0; i < count; i++) {
           array[i] = input.nextInt();
       }
      
       int key = input.nextInt();
       input.close();
       int result=0;
       for (i = 0; i < count; i++) {
           if (array[i] == key) {
               result = (count-1)-i;
           }
       }
       if (result>=0) System.out.println(result);

   }
}
