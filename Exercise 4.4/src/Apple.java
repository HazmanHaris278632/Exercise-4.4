import java.util.Scanner;
public class Apple extends Fruit {
	Scanner s = new Scanner(System.in);
	
	private String colour;
	protected double price, weight;
	
	
	public Apple(String name, String colour, double weight, double price) {//subclass of Fruit
		super(name);
		this.colour = colour;
		this.weight = weight;
		this.price = price;
	
		if(this.weight <= 3) {
			totalPrice(); //overloading with no arguments
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal price \t: RM%.2f",totalPrice());
			
		}
		else if(this.weight > 3 && this.weight <=10) {
			double pr = 5.00;
			totalPrice(pr);
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal price \t: RM%.2f",totalPrice(pr));
		}
		
		else{
			double pr = 2.50;
			double qq = this.weight;
			totalPrice(pr,qq);
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal price \t: RM%.2f",totalPrice(pr,qq));
		}
	}
	public double totalPrice() {//overloading method
		return this.price*this.weight;
	}
	
	public double totalPrice(double pr) {
		return pr*this.weight;
	}
	
	public double totalPrice(double pr,double qq) {
		return pr*qq;
	}  
	public double weight() {
		return weight;
	}
	
	public String getColour(){
		return this.colour;
	}
	
	public String toString() { //overriding method
		return "\nFruit name      : " + super.getName() +
			   "\n" + "Colour \t\t: " + this.getColour();
		
	}
}
	

	 
