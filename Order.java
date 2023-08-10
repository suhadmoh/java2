/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public abstract class Order {
    protected int ID;
    protected String date;
    protected double price;

    public Order(int ID, String date, double price) {
        this.ID = ID;
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" + "ID=" + ID + ", date=" + date + ", price=" + price + '}';
    }

    public int getID() {
        return ID;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
    
}
