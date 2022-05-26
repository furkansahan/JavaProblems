package BasicProblem1;

import java.util.Scanner;

public class BigToSmallNumber {
    public static void main(String[] args) {
        int numberOne,numberTwo,numberThree;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first(N1) number: ");
        numberOne= input.nextInt();
        System.out.println("Please enter the second(N2) number: ");
        numberTwo= input.nextInt();
        System.out.println("Please enter the third(N3)number: ");
        numberThree= input.nextInt();

        if (numberOne>numberTwo && numberOne>numberThree){
             if(numberTwo>numberThree){
                 System.out.println(":+N1>N2>N3");
             }else System.out.println("N1>N3>N2");
        }
        if (numberTwo>numberOne && numberTwo>numberThree){
             if(numberOne>numberThree){
                 System.out.println(":+N2>N1>N3");
             }else System.out.println("N2>N3>N1");
        }
        if (numberThree>numberOne && numberThree>numberTwo){
             if(numberOne>numberTwo){
                 System.out.println(":+N3>N1>N2");
             }else System.out.println("N3>N2>N1");
        }else System.out.println("Numbers are equal.");

        //Find the biggest number.
      /* if(numberOne>numberTwo && numberOne>numberThree) {
           System.out.println("First number biggest number than the other numbers.");
            }else if (numberTwo>numberOne && numberTwo>numberThree){
           System.out.println("Second number biggest number than the other numbers.");

            }else if (numberThree>numberOne && numberThree>numberTwo) {
           System.out.println("Third number biggest number than the other numbers..");

            }else System.out.println("Numbers are equal.");*/

            
        }
    }

