package BasicProblem1;

import java.util.Scanner;

public class PowTwo {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter the number: " );
        number= input.nextInt();

        for (int i = 2; i <number ; i=i*2) {
            System.out.println("Number = " + i);


        }
    }
}
