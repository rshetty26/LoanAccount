/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccount;

/**
 *
 * @author rithv
 */
class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    //constructor for the class

    public Address(String streetSet, String citySet, String stateSet, String zipcodeSet) {
        this.street = streetSet;
        this.city = citySet;
        this.state = stateSet;
        this.zipcode = zipcodeSet;

    }

    //getter and setters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Property Address:" + "\n  " + street + "\n  " + city + ", " + state + " " + zipcode + "\n";
    }    
}
