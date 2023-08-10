/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author HP
 */
import java.io.*;
import java.util.*;
public class Test {

   
    public static void main(String[] args) throws IOException , ClassNotFoundException  {
     
	
        Customer[] customersArray = new Customer[4];
        customersArray[0] = new Customer("Ahmed",2);
        customersArray[1] = new Customer("Mohammed",3);
        customersArray[2] = new Customer("Ali",4);

        Order[] orderArray = new Order[3];
        orderArray[0] = new Regular(10001, "2023-01-25", 550);
        orderArray[1] = new Special(10002, "2022-12-3", 2300,"Ramadan");
        orderArray[2] = new Regular(10003, "2023-1-29", 3100);
        
        //1.	Add all the orders in the orderArray array to the customer Mohammed.
        customersArray[1] .addOrder(orderArray[0]);
        customersArray[1] .addOrder(orderArray[1]);
        customersArray[1] .addOrder(orderArray[2]);
        //2.	Print the number of a special order of customer Mohammed whose occasion is â€œRamadanâ€‌.
        System.out.println(customersArray[1].countSpecial("Ramadan"));
        //3.	Create a CustomerList object and name it â€œlistâ€‌.
        CustomerList list=new CustomerList();
        //4.	Insert all the customers in the customersArray array to the list.
        list.InsetAtfront(customersArray[0]);
        list.InsetAtfront(customersArray[1]);
        list.InsetAtfront(customersArray[2]);
        //5.	Deletes all customers whose price of all orders is less than the 5000.
        
	list.removeCustomer(5000);
    }
    }
    

