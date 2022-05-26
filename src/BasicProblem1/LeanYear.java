package BasicProblem1;

import java.util.Scanner;

public class LeanYear {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("The year you want to query: ");
        year = inp.nextInt();

        if(year % 100 == 0)
        {
            if(year % 400 == 0)
            {
                System.out.println("The year you entered:  "+year);
                System.out.println("The year you entered is a leap year:");
            }
            else
            {
                System.out.println("The year you entered:  "+year);
                System.out.println("The year you entered is a not leap year:");
            }
        }
        else if(year % 4 == 0)
        {
            System.out.println("The year you entered:  "+year);
            System.out.println("The year you entered is a leap year:");
        }
        else
        {
            System.out.println("The year you entered:  "+year);
            System.out.println("The year you entered is a not leap year:");
        }
    }
}
