package DAY5;  
  
import java.util.Scanner;  
  
public class Q2 {  
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);  
      int len = sc.nextInt();  
      int arr[] = new int[len];   
   //ADD(arr, sc);  
   //Display(arr);  
   //swap(arr,sc);
        
   //rev(arr);
   //Display(arr);
   }  
   static void swap (int[] arr, Scanner sc){
    System.out.println("first digit u wanna swap");
    int i = sc.nextInt();  
    System.out.println("second digit u wanna swap");
    int j = sc.nextInt();  
    int c=arr[i];
    arr[i]=arr[j];
    arr[j]=c;                          //swap 2 elements in array
 }
  
   public static void ADD(int arr[], Scanner sc) {  
      for (int i = 0; i < arr.length; i++) {              //take length of an array and input elements in array
        arr[i] = sc.nextInt();  
      }  
   }  
  
   public static void Display(int[] arr) {    //display
      for (int i = 0; i < arr.length; i++) {  
        System.out.print(arr[i] + " ");  
      }  
      System.out.println("");
   }  
   static void rev(int [] arr){
        
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[arr.length-i-1];         //reverse an array
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
            
        }
        System.out.println("");
    }
}