
import java.lang.Math;


public class RegularPolygon {

    private double n = 3;

    private double side = 1;

    private double x = 0;

    private double y = 0;


    public RegularPolygon(){
        this.n = 0;
        this.side = 0;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(double sides, double lengthside){
        this.n = sides;
        this.side = lengthside;
        this.x = 0;
        this.y = 0;
    }



    public RegularPolygon(double sides, double lengthside, double x, double y){
        this.n = sides;
        this.side = lengthside;
        this.x = x;
        this.y = y;
    }




// SETTER AND GETTER OF ALL DATA FIELDS


    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



    public double getPerimeter(){
        return getN() * getSide();
    }


    public double getArea(){

        double numerator = Math.toRadians(getPerimeter());
        double denominator = Math.toRadians(getN()); //converting the N because it has to convert to radians to get the real answer same as the computed tan in calculator
        double total = Math.toRadians(numerator/denominator); // to get a total of Perimeter divided by N(should total to get the real Tan)

        return (getN() * Math.pow(getSide(),2)) / (4 * Math.tan(total));
    }


}
