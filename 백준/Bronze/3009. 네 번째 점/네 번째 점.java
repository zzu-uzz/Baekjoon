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

        int[] xArr = new int[3];
        int[] yArr = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }

        int x, y;
        if (xArr[0] == xArr[1]) {
            x = xArr[2];
        } else {
            x = (xArr[0] == xArr[2]) ? xArr[1] : xArr[0];
        }

        if (yArr[0] == yArr[1]) {
            y = yArr[2];
        } else {
            y = (yArr[0] == yArr[2]) ? yArr[1] : yArr[0];
        }
        bw.write(x + " " + y);
        bw.flush();

        bw.close();
        br.close();
    }
}
