package DAY15;

public class Q2 {                                                //jph sampoorna_dsa
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hi");          //string bulider
        sb.ensureCapacity(100);                  //capacity
        sb.append("cats");                                   //add
        System.out.println(sb.length()) ;                        //length of string
        System.out.println(sb.capacity());                       //capacity it can hold and it can mulity itself by 2 if exceed
        sb.insert(2,"dogs");                          //insert in between
        sb.replace(2, 5, "ily dsa");               //replace any part of string
        sb.delete(0,5);                                //delete a part
        sb.reverse();                                            //reverse
        System.out.println();                                    //
        System.out.println(sb);                                  //print
    }
}
