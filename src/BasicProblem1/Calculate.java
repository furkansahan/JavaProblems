package BasicProblem1;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        double a,b;
        int chooser;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a= input.nextDouble();
        System.out.println("Enter the second number: ");
        b= input.nextDouble();
        System.out.println(" 1.Collection \n 2.Minus \n 3.Impact \n 4.Divide ");
        chooser= input.nextInt();
        try{
        switch (chooser){
            case 1 :
                System.out.println("Result: "+ (a+b) );
                break;
            case 2:
                System.out.println("Result: "+ (a-b));
                break;
            case 3 :
                System.out.println("Result : " + (a*b) );
                break;
            case 4 :
                System.out.println("Result : "+ (a/b));
                break;
            }
            if (chooser>4 || chooser<0) System.out.println("Please enter the value between the 0-4");
        }

        catch (ArithmeticException e) {
            System.out.println("disappearing error");
            System.out.println(e.getMessage());
        }
    }

}
