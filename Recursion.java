public class Recursion {
    // factorial
    static int sumOfNUsingRec(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        // recursion ans
        int recAns = sumOfNUsingRec(n - 1);
        // my Ans
        int myAns = recAns * n;
        return myAns;
    }

    // power of n
    static int power(int a, int Base) {
        // base case
        if (Base == 1) {
            return a;
        }
        int recAns = power(a, Base - 1);
        int myAns = recAns * a;
        return myAns;
    }

    static int power2(int a, int Base) {
        // base case
        if (Base == 1) {
            return a;
        }
        int recAns = power2(a, Base / 2);
        if (Base % 2 == 0) {
            return recAns * recAns;
        } else {
            return recAns * recAns * a;
        }

    }

    static void printArr(int arr[], int si) {
        // base case
        if (si == arr.length) {
            return;
        }
        printArr(arr, si + 1);
        System.out.print(arr[si] + " ");

    }

    static void printArr2(int arr[], int ei) {
        // base case
        if (ei == 0) {
            System.out.print(arr[ei] + " ");
            return;
        }

        System.out.print(arr[ei] + " ");

        printArr2(arr, ei - 1);

    }

    public static void main(String[] args) {
        // int sum = sumOfNUsingRec(5);
        // System.out.println(sum);
        // int pow = power2(2, 3);
        // System.out.println(pow);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        printArr(arr, 0);
    }
}
