import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            H--;
            M = 60 - (45 - M);

            if (H < 0) {
                H = 23;
            }
            bw.write(H + " " + M);
        } else {
            bw.write(H + " " + (M - 45));
        }

        bw.flush();

        bw.close();
        br.close();
    }
}