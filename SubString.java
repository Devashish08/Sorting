import java.util.*;
public class SubString {
    static String[] permutation(String str){
        // base case
        if(str.length()==0){
            return new String[0];
        }
        //recAns
        String smallAns[] = permutation(str.substring(1));
        // my ans
        String myAns[] = new String[smallAns.length*2+1];
        for(int i = 0;i<smallAns.length;i++){
            myAns[i]=smallAns[i];
            myAns[smallAns.length+i]= str.charAt(0) +smallAns[i];
        }
        myAns[myAns.length - 1] = str.charAt(0) + "";
        return myAns;
    }
    public static void main(String[] args) {
      String str = "abc";
      String ans[] = permutation(str);
      System.out.println(Arrays.toString(ans));
    }
}
