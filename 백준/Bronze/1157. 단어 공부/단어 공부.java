import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] frequency = new int[26];
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                frequency[c - 'A']++;
            }
        }

        int max = 0;
        char ch = '?';
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > max) {
                max = frequency[i];
                ch = (char) (i + 65);
            } else if (frequency[i] == max) {
                ch = '?';
            }
        }
        bw.write(String.valueOf(ch));
        bw.flush();

        bw.close();
        br.close();
    }
}
