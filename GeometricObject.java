



public class GeometricObject {

    String color = "White";
    boolean filled = false;


    public GeometricObject(){
        this.color = "White";
        this.filled = false;
    }

    public GeometricObject(boolean filled,String color){
        this.color = color;
        this.filled = filled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    @Override
    public String toString() {

        return "Color: " + color  + "  And Filled: " + filled ;
    }




}
