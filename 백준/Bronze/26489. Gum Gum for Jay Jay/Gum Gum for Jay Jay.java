import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        String line = br.readLine();
        while(line != null) {
            cnt++;
            line = br.readLine();
        }
        System.out.println(cnt);
    }
}