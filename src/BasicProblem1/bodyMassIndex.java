package BasicProblem1;

import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        double weight,height,bodyMassIndex;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your weight: ");
        weight= input.nextDouble();
        System.out.println("Enter your height: ");
        height= input.nextDouble();
        bodyMassIndex=weight/(height*height);
        System.out.println("weight = " + weight);
        System.out.println("height = " + height);
        System.out.println("BMI = " + bodyMassIndex);
    }
}
