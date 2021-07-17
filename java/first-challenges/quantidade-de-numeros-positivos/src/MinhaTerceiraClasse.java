import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MinhaTerceiraClasse {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var positivos = 0;
        for (int i = 0; i < 6; i++) {
            var x = Double.parseDouble(br.readLine());
            if (x > 0)
                positivos++;
        }
        System.out.println(positivos + " valores positivos");
    }
}