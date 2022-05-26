package BasicProblem1;

import java.util.Scanner;

public class OddNumberDivide {
    public static void main(String[] args) {

        int number,total=0;

        Scanner input=new Scanner(System.in);

      do {
          System.out.println("Enter the number: ");
          number= input.nextInt();
            if (number%4==0) {
            total+=number;
          }
      }while (!(number%2==1));
        System.out.println("Total of the number: "+total);
            }
        }



