import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double price;
		double discount;
		System.out.print("Price: $");
		price = input.nextDouble();
		
		discount = (price < 20) ? price * 0.1 : price * 0.05;
		double total = price - discount;
		
		System.out.printf("Price $%.2f\n",  price);
		System.out.printf("Discount: $%.2f\n", discount);
		System.out.printf("Total: $%.2f\n", total);
		
		input.close();

	}

}
