/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public class CustomerList {
    
	private node head;

	public CustomerList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
// insert a customer at the front of the list
	public void InsetAtfront (Customer data){
		node n = new node(data);
		if(isEmpty())
			head=n;
		else
		{
			n.setNext(head);
			head=n;
		}	
	}

 /*deletes all customers whose price of all orders is less than
 the received price.*/
	public void removeCustomer(double price) {
            if (head==null)
                System.out.println("there is no price");
            else{
                
            while(head!=null){
                if(head.getData().calculatePrice()<price)
                head=head.getNext();}
                
            node cu=head.getNext();
            node pr=head;
            while(cu!=null){
             if  ( cu.getData().calculatePrice()<price)
                 pr.setNext(cu.getNext());
            cu=cu.getNext();
            pr=pr.getNext();
            }

		
	}}

// print each customer name and total price of all orders

	public void print () {
		node current = head;
		while (current != null) {
			System.out.println("Customer name =" + current.getData().getname()+" Total Price ="+current.getData().calculatePrice());
			current = current.getNext();
		}
	}
}
