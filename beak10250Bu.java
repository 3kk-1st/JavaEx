import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());

        

        for (int i =0; i < A ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), "");

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(M % H == 0){
                sb.append((H * 100) + (M / H )).append('\n');
            }

            else{
                sb.append((M % H ) * 100 + ((M / H) + 1 )).append('\n');
            }
        }

        System.out.print(sb);
    }
}