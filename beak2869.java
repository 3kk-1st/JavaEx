import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int D = ((C -B) / (A - B));
        if((C -B ) % (A -B ) != 0){
            D++;
        }
        System.out.println(D);
    }
}