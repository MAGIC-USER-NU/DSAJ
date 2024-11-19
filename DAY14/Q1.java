package DAY14;

public class Q1 {            //strings
    static String rev(String str ){

        String s1="";
        for(int i=str.length()-1;i>=0;i--){
            s1=s1+str.charAt(i);
        }
        return s1;
    }

    static int compare (String s1,String s2){
        if(s1==s2) return 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }
        }
        return s1.length()-s2.length();
    }

    static String firstocc(String s ,int k ){
        String ans=s.substring(0,k);
        int i=1;
        k++;
        while(k<=s.length()){
            String temp=s.substring(i,k+1);
            if(compare(ans,temp)>0){
                ans=temp;
            }
            i++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) { 
        // String s1 = "pookie";
        // String x=rev(s1);
        // System.out.println(x);
        String s2="carbarratraz";
        System.out.println(firstocc(s2,3));

    }
}
