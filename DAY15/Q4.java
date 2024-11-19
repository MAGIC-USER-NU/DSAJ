package DAY15;

public class Q4 {                       //wrapperclass
    public static void main(String[] args) {                   //unboxing and autoboxing
        int n1=10;
        Integer n2=10;
        Integer n3=100;
        Integer n4=100;
        Integer n5=128;
        Integer n6=128;
        int n7=n1;
        Integer n8=n7;

        System.out.println(n1==n2);  //true
        System.out.println(n3==n4);
        System.out.println(n5==n6);  //false           limit -128 to 127
        System.out.println(n5.equals(n6));
        System.out.println(n7);
        System.out.println(n8);

        
    }
    
}

