import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int sum = A + B + C;

        if (A == 60 && B == 60 && C == 60) {
            bw.write("Equilateral");
        } else if (sum == 180 && (A == B || A == C || B == C)) {
            bw.write("Isosceles");
        } else if (sum == 180) {
            bw.write("Scalene");
        } else {
            bw.write("Error");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
