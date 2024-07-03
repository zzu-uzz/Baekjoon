import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;
        int q, d, n, p;

        int T = Integer.parseInt(st.nextToken());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            int C = arr[i];
            if (C % Quarter >= 0) {
                q = C / Quarter; // 쿼터의 갯수
                C = C - (Quarter * q);

                d = C / Dime; // 다임의 갯수
                C = C - (Dime * d);

                n = C / Nickel; // 니켈의 갯수
                C = C - (Nickel * n);

                p = C / Penny; // 페니의 갯수
                bw.write(q + " " + d + " " + n + " " + p + "\n");
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
