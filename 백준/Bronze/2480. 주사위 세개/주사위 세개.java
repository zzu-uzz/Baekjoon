import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int prize = 0;

        if (A == B && A == C) {
            prize = 10000 + A * 1000;
        } else if (A == B || A == C) {
            prize = 1000 + A * 100;
        } else if (B == C) {
            prize = 1000 + B * 100;
        } else {
            int max = Math.max(A, Math.max(B, C));
            prize = max * 100;
        }

        bw.write(String.valueOf(prize));

        bw.flush();

        bw.close();
        br.close();
    }
}