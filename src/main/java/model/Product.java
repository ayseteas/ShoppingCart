package model;

public class Product<T> {

  private String name;
  private T price;
  private ItemType itemType;

  public Product(String name, T price, ItemType itemType) {
    this.name = name;
    this.price = price;
    this.itemType = itemType;
  }
  //method to return the name
  public String getName(){
    return name;
  }
  //price
  public T getPrice(){
    return price;
  }
  //method to select category
  public ItemType getItemType(){
    return itemType;
  }


}
