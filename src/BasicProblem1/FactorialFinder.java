package BasicProblem1;

import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2; int fact1 = 1; int fact2 = 1; int fact3=1; double com;


        System.out.println("Enter the number : ");
        num1 = input.nextInt();

        System.out.println("Enter the number : ");
        num2 = input.nextInt();

        if (num1-num2>=0) {
            for (int i = 1; i <= num1; i++) {
                fact1 = fact1 * i;
            }
            System.out.println(fact1);

            for(int j=1; j<=num2; j++){
                fact2=fact2*j;
            }
            System.out.println(fact2);

            for(int k=1; k<=(num1-num2); k++){
                fact3=fact3*k;
                System.out.println(fact3);
            }

            com=fact1/(fact2*fact3);

            System.out.println("combination : " + com);
        } else {
            System.out.println("Enter a positive integer greater than 1");
        }
    }
}

