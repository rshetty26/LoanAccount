/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount;

/**
 *
 * @author rithv
 */
public class CarLoan extends LoanAccount {
    private String vehicleVIN;
    
    public CarLoan(double principalSet, double annualInterestRateSet, int monthsSet, String vehicleVINSet) {
        super(principalSet, annualInterestRateSet, monthsSet);
        this.vehicleVIN = vehicleVINSet;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVehicle VIN: " + vehicleVIN + "\n";
    }
}

