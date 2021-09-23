import java.util.Scanner;

public class main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = 0; //고정비용
        int B = 0; //재료비
        int C = 0; //물건값
        int D = 0;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();


    if(C>B){

        for(int i = 1; i > 0 ; i++){
            if(A+(B*i) < i*C)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
        
    else{
        System.out.println("-1");
    }
    }
}