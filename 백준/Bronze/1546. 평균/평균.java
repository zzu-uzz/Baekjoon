import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int M = arr[0];
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (M < arr[i]) {
                M = arr[i];
            }
        }
        sum = (double) Arrays.stream(arr).sum() / M * 100;
        bw.write(String.valueOf(sum / N));

        bw.flush();

        bw.close();
        br.close();
    }
}