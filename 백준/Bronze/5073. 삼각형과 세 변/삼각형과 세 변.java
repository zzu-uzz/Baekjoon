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

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            if (A >= B + C || B >= A + C || C >= A + B) {
                bw.write("Invalid\n");
            } else if (A == B && B == C) {
                bw.write("Equilateral\n");
            } else if (A == B || A == C || B == C) {
                bw.write("Isosceles\n");
            } else if ((A != B) || (B != C) || (A != C)) {
                bw.write("Scalene\n");
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
