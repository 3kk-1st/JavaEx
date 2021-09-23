import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int H = 0;
        int W = 0;
        int M = 0;
        int R1 = 0;
        
        A = sc.nextInt();

        for(int i = 0;  i  < A ; i++){
            
            
            H = sc.nextInt();
            W = sc.nextInt();
            M = sc.nextInt();
            
            
            if(M % H == 0 ){
                System.out.println((H*100) + (M / H));
            }

            else{
                System.out.println(((M % H) * 100) + ((M / H ) +1));
            }


        }   
    }
}