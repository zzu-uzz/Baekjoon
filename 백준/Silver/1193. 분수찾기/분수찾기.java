import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int numerator = 0; // 분자
        int denominator = 0; // 분모

        int k = 1; // 대각선의 번호
        int sum = 0; // 대각선 번호까지의 누적 합계
        while (X > sum) {
            sum += k;
            k++;
        }
        k--;

        if (k % 2 != 0) {
            denominator = X - (sum - k);
            numerator = k + 1 - denominator;
        } else {
            denominator = sum - X + 1;
            numerator = k + 1 - denominator;
        }
        bw.write(numerator + "/" + denominator);
        bw.flush();

        bw.close();
        br.close();
    }
}
