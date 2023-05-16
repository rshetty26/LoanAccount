/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount;

/**
 *
 * @author rithv
 */
public class UnsecuredLoan extends LoanAccount{
    public UnsecuredLoan(double principalSet, double annualInterestRateSet, int monthsSet) {
        super(principalSet, annualInterestRateSet, monthsSet);
    }
    
    @Override
    public String toString() {
        return "\nUnsecured Loan with: \n"+ super.toString();
    }
}
