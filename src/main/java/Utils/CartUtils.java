package Utils;

import model.Product;
import model.ShoppingCarts;

public class CartUtils {
    public static void printCartItems(ShoppingCarts carts){
        System.out.println("Cart Items: ");
        for(Object item: carts.getItems()){
            // check if the current item is an instance of the product class
            if(item instanceof Product){
                Product<?> product = (Product<?>) item;
                String category = product.getItemType().toString();
                System.out.println(product.getName()+ " _ $"+ product.getPrice()); // ==> $20 pen _ $20
                System.out.println("Category : " + category);
            }
        }
    }

    public static double calculateTotalPrice(ShoppingCarts carts){
        double total=0;
        for(Object item:carts.getItems()){
            if(item instanceof Product){
                Product<?> product = (Product<?>) item;

                Object price = product.getPrice();
                if(price instanceof Number){
                    total+=((Number) price).doubleValue();
                }
            }
        }
        return total;

    }
}
