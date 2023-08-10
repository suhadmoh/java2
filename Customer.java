/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */import java.io.*;

public class Customer implements InputOutput{
    private String name;
	private Order []oList;
	private int nO;
    public Customer(String n , int size){
    	name=n;
    	oList= new Order[size];
    }

    public String getname() {return name;}
    
    /* adds the received order to the customer in the first empty location in oList 
     * if the order was not already in the list , if the order was already added in the list ,
     *  then the method will update the price and date of the order in the list 
     *  the method  returns true if the process is completed successfully, or false otherwise. 
     *  Hint: use the ID to check if the order is already in oList or not.*/
  
    public boolean addOrder(Order b) {
    for(int i=0;i<nO;i++){ 
        if( oList[i].ID==b.ID){
           oList[i].price=b.price;
        oList[i].date=b.date;
        return true;}
            }
    if(nO<oList.length){
        
oList[nO++]=b; return true;}
    return false;
    	   }
    	
/*counts the number of special order with occasion equals to occ. 
 *The method should check if the received occasion (occ), if it is not â€œRamadanâ€‌ or â€œEidâ€‌,
 *a user-defined unchecked exception named â€œIncorrectOccasionâ€‌ should be thrown and handled (caught)
 *in the method; the returned value should be -1. 
*/ 
 public int countSpecial(String occ){
     int c=0;
     try{
         if(!occ.equals("Ramadan")&&!occ.equals("Eid"))
             
         
             throw  new  IncorrectOccasion(); 
            
         for(int i=0;i<nO;i++){
             if(oList[i] instanceof Special &&((Special)oList[i]).getOccasion().equals(occ) )
                 c++;}
             return c;
         }
         catch( IncorrectOccasion e){System.out.println("incorrect"); return -1;}
         
     }
	 
 
 

//returns the price of all orders in the array
 public double calculatePrice(){ 
	 double total=0;
	 for(int i=0 ; i<nO ; i++)
		 total=total+oList[i].getPrice();
	 return total;
   }
 
public void display() {
     System.out.println("customer "+name +" has "+nO+" Orders");
	 for(int i=0 ; i<nO ; i++)
	    System.out.println(oList[i]);
	} 
  public void ReadOrders(String filename){
      try{ 
          File o=new File(filename);
      FileInputStream w=new FileInputStream(o);
      ObjectInputStream fi=new ObjectInputStream(w);
      Order or=null;
      try{
          while(true){
          or= (Order )fi.readObject();
          if(addOrder(or))
                  System.out.println("added succes");
          else
                  System.out.println("cant add");
              
          }} 
      catch(EOFException e){System.out.println("infint");} 
     catch (ClassNotFoundException ex) {System.out.println("castinf error");}
             
          
     
          fi.close();
      }  
      catch(IOException e){System.out.println("error");}
     
  }
}
