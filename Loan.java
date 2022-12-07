
package acitivity5;

import java.util.Date;

/**
 *
 * @author Teano
 */
public class Loan {
    
    
    
    private double annualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 1000;
    private Date loanDate = new Date();

// no arg constructor default values    
    public Loan(){
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
    }

    
// setter and getters    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        
        return monthlyPayment;
    }
    
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        
        return totalPayment;
    }

    public Date getLoanDate() {
        
        return loanDate;
    }
    
    
    
    
   
    
    
    
    
    
}
