import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		Apple a = new Apple("Apple", "Green & Red", 3, 10);
		System.out.println(a);
	
		RedApple b = new RedApple("Red Apple", "Red", "Sweet", "United States", 10, 10);
		System.out.println(b);
		
		GreenApple c = new GreenApple("Green Apple", "Green", "Sweet-Sour", "South Korea", 10, 5);
		System.out.println(c);
		
		YubariMelon d = new YubariMelon("Yubari Melon", "Yellow", "Really Sweet", "Hokkaido, Japan", 1.6, 6, 800);
		System.out.println(d);		
		
		Durian e = new Durian("Black Thorn", "Yellow", "Really Sweet", "Penang, Malaysia", 4, 5, 90);
		System.out.println(e);
		
	}
	

}
