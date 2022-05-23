package BasicProblem1;

import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        int r; double pi=3.14;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the Number of the circle: ");
        r= inp.nextInt();
        double area=pi*r*r;
        double perimeter=2*pi*r;
        System.out.println("Area:"+area );
        System.out.println("Perimeter = " + perimeter);
    }
}
