



public class Rectangle {

        double width = 1;
        double height = 1;


        public Rectangle(){
            this.width = 1;
            this.height = 1;

        }

        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
            System.out.println("Width : " + width + "\nHeight: " + height);
            System.out.println("The Area of the Rectangle: " + getArea());
            System.out.println("The Perimeter of the Rectangle: " + getPerimeter());

        }



    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {

        return (width + height) * 2;
    }
}
