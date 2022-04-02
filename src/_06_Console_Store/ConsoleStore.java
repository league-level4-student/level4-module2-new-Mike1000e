package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

	
	
	
    public static void main(String[] args) {

    	int bank = 100;
    	int candyCost = 1;
    	int cerealCost = 10;
    	int toyCost = 15;
    	int clothingCost = 20;
    	boolean stopShopping = false;
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	
    	System.out.println("What items do you want to shop for? (Food, Non-Food");
    	String shoppinCart = scanner.nextLine();
    	boolean x = shoppinCart.equals("Food") ? true : false;
    	if(x) {
    		Cart<Food> cart = new Cart<Food>();
    		
    		do {
    			System.out.println("What do you want to do? (AddToCart / RemoveFromCart / CheckOut");
    			String doNow = scanner.nextLine();
    			
    			if(doNow.equals("AddToCart")) {
    				System.out.println("What do you want to add to your cart? (Candy / Cereal)");
    				String foodType = scanner.nextLine();
    				boolean foodSelect = foodType.equals("Candy") ? true : false;
    				
    				if(foodSelect) {
    					System.out.println("How much candy would you like? (type in numbers, not letters)");
    					int candyNumber = Integer.parseInt(scanner.nextLine());
    				    for(int i = 0; i < candyNumber; i++) {
    				    	cart.add(new Candy());
    				    }
    				} else {
    					System.out.println("How much cereal would you like? (type in numbers, not letters)");
    					int cerealNumber = Integer.parseInt(scanner.nextLine());
    				    for(int i = 0; i < cerealNumber; i++) {
    				    	cart.add(new Cereal());
    				    	
    				    }
    				}
    						
    			}else if(doNow.equals("RemoveFromCart")) {
    					
    			}else if(doNow.equals("CheckOut")) {
    				stopShopping = true;
    			}
    			
    		} while(stopShopping != true);
    			
    	
    	}else {
    		Cart<NonFood> cart = new Cart<NonFood>();
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}
