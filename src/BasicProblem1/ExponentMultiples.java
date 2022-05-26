package BasicProblem1;

import java.util.Scanner;
public class ExponentMultiples { public static void main(String[] args) {
    int n;
    Scanner input = new Scanner(System.in);
    System.out.println("Sayi giriniz : ");
    n = input.nextInt();
    for (int i = 1; i <= n; i *= 4) {
        if (i % 4 == 0) System.out.println("Multiple of 4: " + i);
        }
    for (int i = 1; i <= n; i *= 5) {
        if (i % 5 == 0) System.out.println("Multiple of 5 : " + i);
        }


    }

}