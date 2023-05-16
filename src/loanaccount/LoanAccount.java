/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanaccount;

/**
 *
 * @author rithv
 */
public class LoanAccount {
    private  double annualInterestRate;
    private double principal;
    private int months;
    

    public LoanAccount(double principalSet, double annualInterestRateSet, int monthsSet) {
        this.principal = principalSet;
        this.annualInterestRate = annualInterestRateSet;
        this.months = monthsSet;
    }
    
    public double calculateMonthlyPayment() {
        double monthlyInterest = annualInterestRate/12;
        double numberOfPayments = months;
        double monthlyPayment = principal * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
        return monthlyPayment;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public double getPrincipal() {
        return principal;
    }

    public int getMonths() {
        return months;
    }
    
    @Override
    public String toString() {
        return "Principal: $" + principal + "\nAnnual Interest Rate: " + annualInterestRate + "%\nTerm of Loan in Months: " + months + "\nMonthly Payment: $" + calculateMonthlyPayment();
    }
}
