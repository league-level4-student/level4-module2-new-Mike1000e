package _06_Console_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
		//Cart<Candy> candy = new Cart<Candy>();
		// 3. Create another Cart object of type Cereal
		//Cart<Cereal> cereal = new Cart<Cereal>();
		// 4. Add a few items to EACH cart
		//Candy candies = new Candy();
		//candy.add(candies);
		//Candy candy1 = new Candy();
		//candy.add(candy1);
		//Candy candy2 = new Candy();
		//candy.add(candy2);
		//Cereal cereal1 = new Cereal();
		//cereal.add(cereal1);
		//Cereal cereal2 = new Cereal();
		//cereal.add(cereal2);
		
		// 5. Call the showCart() method on EACH cart
		//candy.showCart();
		//cereal.showCart();
		
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		
		Cart<Clothing> clothing = new Cart<Clothing>();
		Cart<Toy> toys = new Cart<Toy>();
		
		Toy toy = new Toy();
		Toy toy1 = new Toy();
		Toy toy2 = new Toy();
		toys.add(toy);
		toys.add(toy2);
		toys.add(toy1);
		Clothing clothes = new Clothing();
		Clothing clothes1 = new Clothing();
		Clothing clothes2 = new Clothing();
		clothing.add(clothes2);
		clothing.add(clothes1);
		clothing.add(clothes);
		//toys.showCart();
		clothing.showCart();
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}
