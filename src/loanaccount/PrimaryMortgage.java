/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount;

/**
 *
 * @author rithv
 */
public class PrimaryMortgage extends LoanAccount {
    private double PMIMonthlyAmount;
    private Address address;

    public PrimaryMortgage(double principalSet, double annualInterestRateSet, int monthsSet, double PMIMonthlyAmountSet, Address address) {
        super(principalSet, annualInterestRateSet, monthsSet);
        this.PMIMonthlyAmount = PMIMonthlyAmountSet;
        this.address = address;
    }
    @Override
    public String toString() {
        return "\nPrimary Mortgage Loan with: " + "\nPrincipal: $" + super.getPrincipal() +"\nAnnual Interest Rate: " + super.getAnnualInterestRate() + "%\nTerm of Loan in Months: " + super.getMonths() + "\nPMI Monthly Amount: $" + PMIMonthlyAmount + "\n" + address.toString();
    }
    
}
