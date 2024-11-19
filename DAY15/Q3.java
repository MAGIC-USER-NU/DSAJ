package DAY15;

public class Q3 {
    public static void main(String[] args) {
        String check= " i like to code";
        System.out.println(check.trim());
        System.out.println(reverseString(check));
    }

    static String reverseString(String s){
        s=s.trim();
        String[] s_arr=s.split(" ");
        String ans="";
        for(int i =s_arr.length-1;i<=0;i--){
            ans+=s_arr[i] +" ";
        }
        return ans.trim();
    }
    
}
