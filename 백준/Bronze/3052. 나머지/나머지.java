import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());

            hs.add(A % 42);
        }
        bw.write(String.valueOf(hs.size()));
        bw.flush();

        bw.close();
        br.close();
    }
}