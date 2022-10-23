
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);




        Person p1 = new Person("Jonel", "General Trias Cavite", "09156236917","jonel.teano@cvsu.edu.ph");
        System.out.println(p1.toString());


        Student st1 = new Student("Jonel", "General Trias Cavite", "09156236917","jonel.teano@cvsu.edu.ph", 1);
        System.out.println(st1.toString());

        Employee emp1 = new Employee("Jonel", "General Trias Cavite", "09156236917","jonel.teano@cvsu.edu.ph", 1,5000);
        System.out.println(emp1.toString());

        Faculty fac = new Faculty("Jonel", "General Trias Cavite", "09156236917","jonel.teano@cvsu.edu.ph", 1, 5000,"50","Teacher 1" );
        System.out.println(fac.toString());

        Staff stff1 = new Staff("Jonel", "General Trias Cavite", "09156236917","jonel.teano@cvsu.edu.ph", 1,5000,"Administrator");
        System.out.println(stff1.toString());
































/* Lecture 2 Programming Exercise #1
(COMPLETED)

    Triangle tr = new Triangle(1, 1.5, 1);
    tr.setColor("Yellow");
    tr.setFilled(true);


        System.out.println(
                tr.getArea()           + "\n" +
                tr.getPerimeter()      + "\n" +
                tr.getColor()          + "\n" +
                tr.isFilled()
         //      + "\n" + tr.toString()
        );

*/






/*  Lecture 1 Programming Exercise #3
(COMPLETED but I add some variable that converting N and perimeter to radians to get the real answer of Tangent same on calculator
Without it you can't get the same value of Tangent output by calculator (Without the Variables))

        RegularPolygon polnoArgument = new RegularPolygon();


        System.out.println("The N: " + polnoArgument.getN());
        System.out.println("The Length Side: " + polnoArgument.getSide());
        System.out.println("The Area: " + polnoArgument.getArea());
        System.out.println("The Perimeter: " + polnoArgument.getPerimeter() + "\n");




        RegularPolygon RegularPolygonThatCentered = new RegularPolygon();

        RegularPolygonThatCentered.setN(6);
        RegularPolygonThatCentered.setSide(4);


        System.out.println("The N: " + RegularPolygonThatCentered.getN());
        System.out.println("The Length Side: " + RegularPolygonThatCentered.getSide());
        System.out.println("The X: " + RegularPolygonThatCentered.getX());
        System.out.println("The Y: " + RegularPolygonThatCentered.getY());
        System.out.println("The Area: " + RegularPolygonThatCentered.getArea());
        System.out.println("The Perimeter: " + RegularPolygonThatCentered.getPerimeter() + "\n");





        RegularPolygon RegularPolygonWithSpecifiedValues = new RegularPolygon();


        RegularPolygonWithSpecifiedValues.setN(10);
        RegularPolygonWithSpecifiedValues.setSide(4);
        RegularPolygonWithSpecifiedValues.setX(5.6);
        RegularPolygonWithSpecifiedValues.setY(7.8);



        System.out.println("The N: " + RegularPolygonWithSpecifiedValues.getN());
        System.out.println("The Length Side: " + RegularPolygonWithSpecifiedValues.getSide());
        System.out.println("The X: " + RegularPolygonWithSpecifiedValues.getX());
        System.out.println("The Y: " + RegularPolygonWithSpecifiedValues.getY());
        System.out.println("The Area: " + RegularPolygonWithSpecifiedValues.getArea());
        System.out.println("The Perimeter: " + RegularPolygonWithSpecifiedValues.getPerimeter());
*/





     /*  HOW TO GET TANGENT THAT SAME AS THE CALCULATOR


        double a = 4; // the input number when you compute it in calculator using tan
        double b = Math.toRadians(a);  // you have to convert the tan value you want to input to radians first to output same as calculator

        double n = 10;
        double perimeter = 40;

        double numerator = Math.toRadians(perimeter);
        double denominator = Math.toRadians(n);
        double total = Math.toRadians(numerator/denominator);

        System.out.println("\n" + Math.tan(total));

    /*












/*  Lecture #1
Programming Exercise #2
COMPLETED But I Change some Details in the Formula of getting the Percent because of the formula
in the given is not same on real formula of how to get the ChangePercent from Google




        Stock st = new Stock("JAVA" ,"Sun Microsystems Inc");

*/







/*  Lecture #1
Programming Exercise #1
(COMPLETED)

        Rectangle rc1 = new Rectangle(4, 40);
        Rectangle rc2 = new Rectangle(3.5, 35.9);

*/


    }

}
