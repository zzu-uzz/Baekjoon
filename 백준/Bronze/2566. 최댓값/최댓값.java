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

        StringTokenizer st;

        int[][] arr = new int[9][9];
        int max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i + 1;
                    column = j + 1;
                } else if (max == 0) {
                    row = 1;
                    column = 1;
                }
            }
        }
        bw.write(max + "\n" + row + " " + column);

        bw.flush();

        bw.close();
        br.close();
    }
}
