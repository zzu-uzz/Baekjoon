import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }
        for (int j : arr) {
            bw.write(j + " ");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}