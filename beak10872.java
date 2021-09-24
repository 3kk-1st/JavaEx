import java.util.Scanner;

public class Main{
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        int A = sc.nextInt();
        System.out.println(Funtion(A));
        
    }


    public static int Funtion(int A){

        if(A == 0){
            return 1;
        }
        else{
            return A * Funtion(A-1);
        }
    }
}