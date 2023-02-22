package lab4.exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {
    public void Third() throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(scanner.readLine());
            int b = Integer.parseInt(scanner.readLine());
            int c = Integer.parseInt(scanner.readLine());
            if (a < c + b && b < a + c && c < b + a) {
                System.out.println("Такий трикутник існує");
                if (a == Math.sqrt(Math.pow(c, 2) + Math.pow(b, 2)) || b == Math.sqrt(Math.pow(c, 2) + Math.pow(a, 2))
                        || c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) {
                    System.out.println("Трикутник прямокутний");
                    break;
                } else if (a == b && c == b && c == a) {
                    System.out.println("Трикутник рівностороній");
                    break;
                } else if (a == b || b == c || c == a) {
                    System.out.println("Трикутник рівнобедрений");
                    break;
                } else {
                    System.out.println("Трикутник довільний");
                    break;
                }
            } else {
                System.out.println("Ведіть праивльно числа наново");
            }
        }
    }
}