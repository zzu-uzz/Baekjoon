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

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];

        for (int i = 0; i < chess.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < chess.length; i++) {
            bw.write(chess[i] - input[i] + " ");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
