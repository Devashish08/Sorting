public class Permutation {
    static String[] permutation1(String str){
        // super case
        if(str.length()==0){
            return new String[0];
        }
        // base case
        if(str.length()==1){
            String ans[]=new String[1];
            ans[0] = str;
            return ans;
        }
        // rec ans
        String smallAns[] = permutation1(str.substring(1));
        // myAns
        int len =(smallAns.length == 1) ? 2 :smallAns.length * str.length();
        String myAns[] = new String[len];
        int k =0;
        for(int i = 0;i<small)
        return myAns;
    }
    public static void main(String[] args) {
        
    }
}
