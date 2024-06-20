import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i1 = 0; i1 < M; i1++) {
            st = new StringTokenizer(br.readLine(), " ");

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for (int j1 = I - 1; j1 < J; j1++) {
                arr[j1] = K;
            }
        }

        for (int k1 = 0; k1 < arr.length; k1++) {
            bw.write(arr[k1] + " ");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}