package lab4.exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public void Second() throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write number of x");
        int x = Integer.parseInt(scanner.readLine());
        System.out.println("Write number of y");
        int y = Integer.parseInt(scanner.readLine());
        if ((x < 0 && y < 0)) {
            System.out.println(Math.abs(x));
            System.out.println(Math.abs(y));
        } else if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
            System.out.println(x + 1);
            System.out.println(y + 1);
        } else if ((x >= 2 && x <= 9) && (y >= 2 && y <= 9)) {
            System.out.println((double) x / 10);
            System.out.println((double) y / 10);
        } else {
            System.out.println(x);
            System.out.println(y);
        }
    }
}