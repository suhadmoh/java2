/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public class node {
    private Customer data;
	private node next;
	
	public  node(Customer data) {
		this.data = data;
		this.next = null;
	}
	public Customer getData() {
		return data;
	}
	public void setData(Customer data) {
		this.data = data;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
}
