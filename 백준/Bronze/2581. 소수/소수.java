import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        prime = new boolean[N + 1];
        getPrime();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        if (M <= N) {
            for (int i = M; i <= N; i++) {
                if (prime[i] == false) {
                    sum += i;
                    if (min == Integer.MAX_VALUE) {
                        min = i;
                    }
                }
            }
            if (sum == 0) {
                bw.write("-1");
            } else {
                bw.write(sum + "\n" + min);
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }

    public static void getPrime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
