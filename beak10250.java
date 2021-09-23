import java.util.Scanner;
import java.util.Arrary;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int H = 0;
        int W = 0;
        int M = 0;
        int R1 = 0;
        
        A = sc.nextInt();
        int [] R = new R[A]-1;

        for(int i = 0;  i > A-1 ; i++){
            H = sc.nextInt();
            W = sc.nextInt();
            M = sc.nextInt();
            sc.close();

            R1 = (M%H)*100;
            R1 = R1 + (M/H +1);
            R[i] = R1;
            }
        }

        System.out.println(R[]);

    }
}