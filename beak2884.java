import java.util.Scanner;

public class beak2884{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();
        
        if(B < 45) {
			A--;		
			B= 60 - (45 - B); 	
			if(A < 0) {
				A = 23;
			}
			System.out.println(A + " " + B);
		}
		else {
			System.out.println(A + " " + (B - 45));
		}
	}
}