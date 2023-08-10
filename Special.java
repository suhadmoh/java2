/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public class Special extends Order{
   private String occasion;

    public Special( int ID, String date, double price,String occasion) {
        super(ID, date, price);
        this.occasion = occasion;
    }

    @Override
    public String toString() {
        return super.toString()+"Special{" + "occasion=" + occasion + '}';
    }

    public String getOccasion() {
        return occasion;
    }
   
}
