
package calculatorwinterface;

/**
 *
 * @author Teano
 */
public class BasicCalculator extends BasicMathOperation{
    double num1;
    double num2;
    double result;

    @Override
    public void setNumber(double n1, double n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    @Override
    public double getNumber() {
        
        return result;   
    }

   

    @Override
    void add() {
        result = num1 + num2;
    }

    @Override
    void subtract() {
         result = num1 - num2;
    }

    @Override
    void divide() {
         result = num1 / num2;
    }

    @Override
    void multiply() {
         result = num1 * num2;
    }
    
    


    

    

    
    

    
    
}
