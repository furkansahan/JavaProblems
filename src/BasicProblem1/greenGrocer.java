package BasicProblem1;

import java.util.Scanner;

public class greenGrocer {
    public static void main(String[] args) {
        double pear,apple,tomato,banana,aubergine;
        pear=2.14;apple=3.67;tomato=1.11;banana=0.95;aubergine=5;
        double kg,total;
        Scanner input=new Scanner(System.in);

        System.out.println("How many pear KG do you want?");
        kg= input.nextDouble();
        double pearprice=kg*pear;

        System.out.println("How many apple KG do you want?");
        kg= input.nextDouble();
        double appleprice=kg*apple;

        System.out.println("How many tomato KG do you want?");
        kg= input.nextDouble();
        double tomatoprice=kg*tomato;

        System.out.println("How many banana KG do you want?");
        kg= input.nextDouble();
        double bananaprice=kg*banana;

        System.out.println("How many aubergine KG do you want?");
        kg= input.nextDouble();
        double aubergineprice=kg*aubergine;

        total=pearprice+appleprice+tomatoprice+bananaprice+aubergineprice;
        System.out.println("You bought pear: "+pearprice);
        System.out.println("You bought apple: "+appleprice);
        System.out.println("You bought tomato: "+tomatoprice);
        System.out.println("You bought banana : "+bananaprice);
        System.out.println("You bought aubergine: "+aubergineprice);
        System.out.println("Total: "+total);
    }
}
