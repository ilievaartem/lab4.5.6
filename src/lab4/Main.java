package lab4;
import lab4.exercise.First;
import lab4.exercise.Second;
import lab4.exercise.Third;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue){
            System.out.println("Write the number of exercise:");
             String choice = scan.nextLine();
             switch (choice){
                 case "0":
                     isTrue = !isTrue; /* ! - зворотнє значення */
                     break;
                 case "1":
                     First first = new First();
                     first.First();
                     break;
                 case "2":
                     Second second = new Second();
                     second.Second();
                     break;
                 case "3":
                     Third third =new Third();
                     third.Third();
                     break;
                 default:
                     System.out.println("Write the correct number");
             }
        }
    }
}           