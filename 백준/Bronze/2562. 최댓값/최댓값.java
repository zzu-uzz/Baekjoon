import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());

            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        bw.write(String.valueOf(max + "\n" + index));
        bw.flush();

        bw.close();
        br.close();
    }
}