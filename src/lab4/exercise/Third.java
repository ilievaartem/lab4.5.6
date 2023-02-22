package lab4.exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {
    public void Third() throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(scanner.readLine());
        int b = Integer.parseInt(scanner.readLine());
        int c = Integer.parseInt(scanner.readLine());
        if (a < c + b && b < a + c && c < b + a){
            System.out.println("Такий трикутник існує");
        } else {
            System.out.println("Ведіть праивльно числа наново");
        }
    }
}
