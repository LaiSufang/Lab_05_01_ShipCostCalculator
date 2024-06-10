import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // An application program where the user enters the price of an item and the program computes shipping costs. If the item price is $100 or more, then shipping is free otherwise it is 2% of the price. The program should output the shipping cost and the total price.

        int itemPrice;
        double shippingCost;
        double totalPrice;
        final double SHIPPING_RATE = 0.02;
        String prompt = "Please enter the price of the item: ";

        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        if (in.hasNextInt()) {
            itemPrice = in.nextInt();
            if (itemPrice >= 100) {
                shippingCost = 0;
                totalPrice = itemPrice;
                System.out.println("The shipping cost is free, and the total price is $" + totalPrice);
            }
            else if (itemPrice > 0) {
                shippingCost = itemPrice * SHIPPING_RATE;
                totalPrice = itemPrice + shippingCost;
                System.out.println("The shipping cost is $" + shippingCost + ", and the total price is $" + totalPrice);
            }
            else {
                System.out.println("Invalid input. Please enter a valid price.");
            }
        }
        else {
            System.out.println("Invalid input. Please enter a valid price.");
        }




    }


}