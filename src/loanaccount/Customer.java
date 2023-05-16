/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount;
import java.util.ArrayList;

/**
 *
 * @author rithv
 */
public class Customer {    
    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccount> loanAccounts;
    
    public Customer(String firstNameSet, String lastNameSet, String SSNSet) {
        this.firstName = firstNameSet;
        this.lastName = lastNameSet;
        this.SSN = SSNSet;
        loanAccounts = new ArrayList<LoanAccount>();
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getSSN() {
        return SSN;
    }
    
    public void addLoanAccount(LoanAccount account) {
        loanAccounts.add(account);
    }
    
    public void printMonthlyReport() {
        System.out.print("Account Report for Customer: " + firstName + " " + lastName + " with SSN " + SSN + "\n\n");
        for(LoanAccount loan:loanAccounts) {
            System.out.println(loan + "\n");
        }
    }    
    
    @Override
    public String toString() {
        return "test";
    }
    
}
