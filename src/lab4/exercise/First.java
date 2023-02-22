package lab4.exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public void First() throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int rating1 = 0;
        int rating2 = 0;
        int rating3 = 0;
        while (true){
            try {
            System.out.println("Write your first grade");
               rating1 = Integer.parseInt(scanner.readLine());
                System.out.println("Write your second grade");
               rating2 = Integer.parseInt(scanner.readLine());
                System.out.println("Write your third grade");
               rating3 = Integer.parseInt(scanner.readLine());
               if (!(rating1 <= 5 && rating1 >=1) || !(rating2 <= 5 && rating2 >=1) || !(rating3 <= 5 && rating3 >=1) ){
                   /* можна було так записати/це типу цей запис (rating1 >5 && rating1 <1) */
                   continue;
               }
               break;
            }
            catch (NumberFormatException exception){
                System.out.println("Write the student's grades");
            }
        }
        if (rating1 + rating2 + rating3 == 15) {
            System.out.println("The student get higher bursary");
        } else if (rating1 + rating2 + rating3 >= 11){
            System.out.println("The student get normal bursary");
        }
        else {
            System.out.println("The student doesn't have a bursary");
        }

    }
}
