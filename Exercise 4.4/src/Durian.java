
public class Durian extends Fruit {//subclass of Fruit

	private String colour, country, taste;
	private double weight, price;
	private int quantity;
	
	public Durian(String name, String colour, String taste, String country, double weight, int quantity, double price) {
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.country = country;
		this.weight = weight;
		this.quantity = quantity;
		this.price = price;
		
		if(this.quantity <= 1) {
			totalPrice(); //overloading with no arguments
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total price \t: RM%.2f",totalPrice());
			
		}
		else if(this.quantity == 5) {
			double pr = 80;
			totalPrice(pr);
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total price \t: RM%.2f",totalPrice(pr));
		}
		
		else if (this.quantity == 10){
			double pr = 75;
			double qq = this.quantity;
			totalPrice(pr,qq);
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total price \t: RM%.2f",totalPrice(pr,qq));
		}
		else {
			System.out.println("Limit for 10 only! This is high demand fruit!");
		}
	}
	public double totalPrice() {//overloading method
		return this.price*this.quantity;
	}
	public double totalPrice(double pr) {
		return pr*this.quantity;
	}
	public double totalPrice(double pr,double qq) {
		return pr*qq;
	}  
	public String getColour() {
		return this.colour;
	}
	public String getTaste() {
		return this.taste;
	}
	public String getCountry() {
		return this.country;
	}
	public double weight() {
		return weight;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public String toString() { //overriding method
		return "\nName \t\t: " + super.getName() +
				"\nColour \t\t: " + this.colour +
				"\nTaste \t\t: " + this.taste +
				"\nWeight \t\t: " + this.weight + "kg" +
				"\nCountry \t: " + this.country;
			
	}
	
}
