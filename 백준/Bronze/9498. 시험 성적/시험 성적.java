import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int score = Integer.parseInt(st.nextToken());
        char grade = (90 <= score && score <= 100) ? 'A' : ((80 <= score && score <= 89) ? 'B' :
                ((70 <= score && score <= 79) ? 'C' : (60 <= score && score <= 69) ? 'D' : 'F'));

        bw.write(grade);
        bw.flush();

        bw.close();
        br.close();
    }
}