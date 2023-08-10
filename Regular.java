/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public class Regular extends   Order implements Discount{

    public Regular(int ID, String date, double price) {
        super(ID, date, price);
    }
     public void applyDiscount(int dis){
       
            price=price-(price*(rate[dis]));
     }
    
}
