import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();
        
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replace(arr[i], "!");
            }
        }
        bw.write(String.valueOf(s.length()));
        bw.flush();

        bw.close();
        br.close();
    }
}
