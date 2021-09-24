import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        System.out.println(Funtion(A));


    }


    public static int Funtion(int A){

        if(A == 0) return 0;
        if(A == 1) return 1;
        return Funtion(A -1) + Funtion(A -2);
    }
}