package codeguide;

import java.util.Stack;

/**
 * A Cart that you can store the items as much as it's capacity goes.
 * @author Non Puthikanon
 *
 */
public class Cart {
	private int CAPACITY = 10;
	private int capacity;
	private Stack<String> product;
	private int count = 0;
	
	public Cart() {
		this.capacity = this.CAPACITY;
	}
	
	public Cart(int capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * This method fill the cart with items you input. But it should not count for the cart.
	 * Create a new method to separate their work.
	 * @param product is a String value of an item you want.
	 */
	public void fillCart(String product) {
		if(this.count<this.CAPACITY){
			this.product.push(product);
			this.count++;
		}
		else {
			System.out.println("The cart is full!!");
		}
		//TODO Create a new method to separate their work.
	}
	
	/**
	 * This method remove the item you want from the cart.
	 * And check if once you have removed it, Is the cart still has any stuff left.
	 * It should not do two things at the same time.
	 * @param product is a String value of an item you want.
	 * @return true of there is something left. false if there is not.
	 */
	public boolean removeAndCheck(String product) {
		if(this.product.contains(product)) {
			this.product.remove(product);
			if(!this.product.isEmpty()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			System.out.println("This item is not in the cart.");
			return false;
		}
		//TODO Create a new method that will check for it.
	}
	
	

}
