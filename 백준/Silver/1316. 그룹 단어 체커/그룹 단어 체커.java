import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean[] arr = new boolean[26];
            boolean isGroup = true;

            for (int j = 0; j < s.length(); j++) {
                int ch = s.charAt(j) - 97;
                if (arr[ch]) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        isGroup = false;
                        break;
                    }
                } else {
                    arr[ch] = true;
                }
            }
            if (isGroup) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();

        bw.close();
        br.close();
    }
}
