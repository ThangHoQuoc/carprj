package carprj1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Car implements Comparable<Car>{
    
    private String CarID;
    private Brand brand;
    private String color;
    private String frameID;
    private String engineID;

    public Car() {
    }

    public Car(String CarID, Brand brand, String color, String frameID, String engineID) {
        this.CarID = CarID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }

    public String getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameID() {
        return frameID;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    @Override
    public String toString() {
        return "Car{" + "CarID=" + CarID + ", brand=" + brand + ", color=" + color + ", frameID=" + frameID + ", engineID=" + engineID + '}';
    }
    
    
    
    public String screenString(){
        
        
        return null;
    }

    @Override
    public int compareTo(Car c) {
        
        int d = this.brand.getBrandName().compareTo(c.brand.getBrandName());
        
        if(d !=0) return d;
        return this.CarID.compareTo(c.CarID);
    }
    
    
    
}
