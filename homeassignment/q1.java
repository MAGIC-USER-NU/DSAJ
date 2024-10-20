package homeassignment;


public class q1 {
    public static void main(String[] args) {
        int n=5;
        // square(n);      //1
        //RFT(n);          //2
        //IRFT(n);         //3
        //LFT(n);          //4
        //ILFT(n);         //5
        //ILFTS(n);        //6
        //BOX(n);          //7
        //CROSS(n);        //8
        //TRI(n);          //9
        //ITRI(n);         //10
        //STP3(n);         //11
        //STP4(n);         //12
        //RRTRI(n);        //13
        //RLTRI(n);        //14
        //ARSP(n);         //15
        //IARSP(n);        //16
                           //17
        //DIAMOND(n);      //18
                           //19
        //HOLLOWDIA(n);    //20
        //CUT(n);          //21
        //ICUT(n);         //22
        //TRI1(n);         //23
        //TRIP2(n);        //24
        //TRI123(n);       //25
        //NOLINETRI(n);    //26
        //NOTRI(n);        //27
        //NOTRI1(n);       //28
        //TRI0S(n);        //29
        //REVREC(n);       //30
        //REVRECS(n);      //31
        //PT2(n);          //32
                           //33

    }
    public static void square (int n){
        for(int i=1;i<=n;i++){
            System.out.println("");
            for(int j=1;j<=n;j++){                           // square
                System.out.print("*");
            }
        }
    }

    public static void RFT (int n){
        for(int i=1;i<=n;i++){                     //RFT
            System.out.println("");
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    }

    public static void IRFT (int n){
        for(int i=0;i<n;i++){
            System.out.println("");
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
        }
    }

    public static void LFT (int n){
        for(int i=1;i<=n;i++){
            System.out.println("");
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    }

    public static void ILFT (int n){
        for(int i=0;i<n;i++){
            System.out.println("");
            for(int k=1;k<=(i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
        }
    }

    public static void ILFTS (int n){
        for(int i=0;i<n;i++){
            System.out.println("");
            for(int k=1;k<=2*(i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
        }
    }
    public static void BOX (int n){
        for(int i=1;i<=n;i++){    
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1|| j==n){
                    System.out.print("*");
                    System.out.print(" ");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println("");  
        }
    }
    public static void CROSS (int n){
        for(int i=1;i<=n;i++){  
            for(int j=1;j<=n;j++){
                if(i==j ||j==(n-i+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");  
        }
    }

    public static void TRI (int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int w=1;w<=i-1;w++){
                System.out.print("*");
            }
            System.out.println("");  
        }
    }

    public static void ITRI (int n){
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int w=1;w<=i-1;w++){
                System.out.print("*");
            }
            System.out.println("");  
        }
    }
    public static void RRTRI (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=(n-1);i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void RLTRI (int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=(n-1);i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public static void ARSP (int n){
        for(int i=0;i<=n;i++){
            
            for(int k=1;k<=2*i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                while(i!=n-1){
                System.out.print("*");
                break;
                }
            }
            if(i<n-2){
                System.out.println("");
            }
            
        }
        for(int i=n;i>=0;i--){
            
            for(int k=2*i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
        
    }
    public static void IARSP (int n){
        for(int i=0;i<=n;i++){
        
            for(int k=2;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                while(i!=n-1){
                System.out.print("*");
                break;
                }
        
            }
            if(i!=n && i!=n-1)
            System.out.println("");
            
            
        }
        for(int i=0;i<n;i++){
            
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
    
        }


    }
    public static void DIAMOND (int n){
        for(int i=1;i<=n-3;i++){
            for(int k=1;k<=n-i-3;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int w=1;w<=i-1;w++){
                System.out.print("*");
            }
            System.out.println("");  
        }
    
        for(int s=n-4;s>=1;s--){
            for(int k=4;k<=n-s;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=s;j++){
                System.out.print("*");
            }
            for(int w=1;w<=s-1;w++){
                System.out.print("*");
            }
            System.out.println("");  
        }
    }
    public static void CUT (int n){
        for(int i=1;i<=n;i++){
            System.out.println("");
            int x=0;
            if(i==n){
                x=1;
            }
            for(int j=1;j<=i-x;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i)-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    }

    public static void ICUT (int n){
        for(int i=n;i>=1;i--){
            System.out.println("");
            int x=0;
            if(i==n){
                x=1;
            }
            for(int j=1;j<=i-x;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i)-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    }

    public static void TRI1 (int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            for(int w=1;w<=i-1;w++){
                System.out.print("1");
            }
            System.out.println("");  
        }
    }
    public static void TRIP2 (int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            for(int w=1;w<=i-1;w++){
                System.out.print(i);
            }
            System.out.println("");  
        }

    }

    public static void TRI123 (int n){    
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i)*3;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if( x<10){
                    System.out.print(x+"  ");
                    x++;
                }else{
                System.out.print(x +" ");
                x++;
                }
            }
            System.out.println();
        }

    }

    public static void NOLINETRI (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1   ;k++){
                System.out.print(k);
            }
            System.out.println("");
        }
    }

    public static void NOTRI (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int t=i-1;t>=1;t--){
                System.out.print(t);
            }
            System.out.println("");
        }

    }

    public static void NOTRI1 (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=(2*i)-1;k++){
                System.out.print(k);
            }
            int x=1;
            for(int t=(2*i)-1-x;t>=i;t--){
                System.out.print(t);
                x--;
            }
            System.out.println("");
        }

    }

    public static void TRI0S (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            System.out.print(i);
            for(int j=2;j<=i;j++){
                System.out.print("0");
            }

            for(int j=3;j<=i;j++){
                System.out.print("0");
            }

            if(i>1)
            System.out.print(i);
            System.out.println("");
        }
    }

    public static void REVREC(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    

    public static void REVRECS (int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }

    public static void PT2 (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(i);
                if(x==)
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=(n-1);i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void STP3 (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    public static void STP4 (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
                while(k<i){
                    System.out.print("!");
                    break;
                }
            }
            
            
            System.out.println("");
        }
    }


    public static void HOLLOWDIA(int n){
        int i, j, k;
		for (i = 1 ; i <= n; i++ ) 
		{
			for (j = 1 ; j <= n - i; j++ ) 
			{
				System.out.print(" ");	
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (i = n - 1 ; i > 0; i-- ) 
		{
			for (j = 1 ; j <= n - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	



    }



    

                                 







    






}
