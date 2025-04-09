/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.studentmanagement;

/**
 *
 * @author lab_services_student
 */
public class Address {
    
    private String streetName;
    private int streetNumber;
    private String postalCode;
    private String city;
    private String province;
    private String country;

    public Address(String streetName, int streetNumber, String postalCode, String city, String province, String country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    public Address() {
    }
    
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "streetName=" + streetName + ", streetNumber=" + streetNumber + ", postalCode=" + postalCode + ", city=" + city + ", province=" + province + ", country=" + country + '}';
    }
    
    
}
