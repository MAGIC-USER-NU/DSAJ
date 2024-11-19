package DAY15;

public class Q1 {
    static boolean pallindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
            
        }
        return true;
    }


    public static void main(String[] args) {
        String str ="xauusd";
        System.out.println(pallindrome(str));
        
    }
    
}
