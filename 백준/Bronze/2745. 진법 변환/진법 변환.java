import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class  Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        long result = 0;
        int exponent = 0;
        int temp;

        for (int i = N.length() - 1; i >= 0; i--) {
            char ch = N.charAt(i);
            if (ch >= '0' && ch <= '9') {
                temp = ch - '0';
            } else {
                temp = ch - 55;
            }
            result += (long) (temp * Math.pow(B, exponent++));
        }
        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();
    }
}
