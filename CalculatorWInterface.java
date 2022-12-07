
package calculatorwinterface;


public class CalculatorWInterface {

  
    public static void main(String[] args) {
        BasicCalculator compute = new BasicCalculator();
        compute.setNumber(20, 2);     
        compute.add();
        System.out.println("Result: \n" + compute.getNumber());
        
        BasicCalculator computeMultiply = new BasicCalculator();
        computeMultiply.setNumber(20, 2);     
        computeMultiply.multiply();
        System.out.println("Result: \n" + computeMultiply.getNumber());
       
   
        
      
    }
    
}
