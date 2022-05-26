package BasicProblem1;

import java.util.Scanner;

public class ChineseZS {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year,i;

        System.out.print("Enter the year you were born: ");
        year = inp.nextInt();

        i = year % 12;

        switch (i)
        {
            case 0:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Monkey");
                break;
            case 1:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Cockerel");
                break;
            case 2:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Dog");
                break;
            case 3:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Pig");
                break;
            case 4:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Mouse");
                break;
            case 5:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Cow");
                break;
            case 6:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Tiger");
                break;
            case 7:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Rabbit");
                break;
            case 8:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Dragon");
                break;
            case 9:
                System.out.println("your year of birth:"+year);
                System.out.println("Your Chinese Zodiac Sign: Snake");
                break;
            case 10:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Horse");
                break;
            case 11:
                System.out.println("your year of birth: "+year);
                System.out.println("Your Chinese Zodiac Sign: Sheep");
                break;
        }

    }

}
