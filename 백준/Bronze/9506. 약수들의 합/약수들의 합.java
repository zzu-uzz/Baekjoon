import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            int[] arr = new int[n];
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i != n) {
                    arr[i] = i;
                    sum += i;
                }
            }
            if (sum != n) {
                bw.write(n + " is NOT perfect." + "\n");
                continue;
            }
            bw.write(n + " = 1");

            for (int i = 1; i <= n; i++) {
                if (arr[i - 1] != 0 && arr[i - 1] != 1) {
                    bw.write(" + " + arr[i - 1]);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        
        bw.close();
        br.close();
    }
}
