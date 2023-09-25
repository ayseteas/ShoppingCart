package comtpemain;

import Utils.CartUtils;
import model.ItemType;
import model.Product;
import model.ShoppingCarts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Retrieving data from the user
        ShoppingCarts carts = new ShoppingCarts();
        Scanner input= new Scanner(System.in);
        int choice;
        do {
            System.out.println("Shopping Carts Menu: ");
            System.out.println("1. Add products");
            System.out.println("2. Display Cart");
            System.out.println("3. Total Cost");
            System.out.println("4. Exit");
            choice=input.nextInt();

            switch (choice){
                case 1:
                    //add products
                    System.out.println("Enter Product Name: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("Enter Product Price: ");
                    double price = input.nextDouble();
                    System.out.println("Select Category: ");
                    int i=1;
                    for (ItemType itemType: ItemType.values()){
                        System.out.println(i + " ."+itemType); //1.BOOK == 2.CLOTHING
                        i++;
                    }
                    System.out.println("Enter Category Choice: ");
                    int categoryChoice = input.nextInt();
                    ItemType selectCategory = ItemType.values()[categoryChoice-1];   //1-1 = 0

                    Product<Double> product = new Product<>(name, price, selectCategory);
                    carts.addItem(product);
                    System.out.println("Product Added to Cart. ");
                    break;
                case 2:
                    //Display Cart
                    CartUtils.printCartItems(carts);
                    break;
                case 3:
                    //Calculate the Total Price
                    System.out.println("Total Price: "+CartUtils.calculateTotalPrice(carts));
                    break;
                case 4:
                    //Exit
                    System.out.println("Thank you for shopping with us. Have a good day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please Select a Valid Option");
                    break;
            }
        }while (choice!=4);
    }
}



