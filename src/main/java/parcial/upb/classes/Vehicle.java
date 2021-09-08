/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.upb.classes;

/**
 *
 * @author santi
 */
public class Vehicle implements Comparable<Vehicle> {
    
    private String licensePlate;
    private String brand;
    private Driver owner;
    
    public Vehicle(String licensePlate, String brand, Driver owner){
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.owner = owner;
    }

    public Vehicle(String licensePlate, String brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
    }
    

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Driver getOwner() {
        return owner;
    }

    public void setOwner(Driver owner) {
        this.owner = owner;
    }

    @Override
    public int compareTo(Vehicle v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "License: "+licensePlate+ " Brand: "+brand;
    }
    
}
