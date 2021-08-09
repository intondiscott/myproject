   //===Private fields - itemName, itemPrice, and itemQuanity===
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   //===Default constructor created===
   public ItemToPurchase(){
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }
   
   
   
   //===public member methods (mutators & accessors)===
   public void setName(String itemName){
      this.itemName = itemName;
   }
   
   public String getName(){
      return itemName;
   }
   
   public void setPrice(int itemPrice){
      this.itemPrice = itemPrice;
   }
   
   public int getPrice(){
      return itemPrice;
   }
   
   public void setQuantity(int itemQuantity){
      this.itemQuantity = itemQuantity;
   }
   
   public int getQuantity(){
      return itemQuantity;
   }
    
   //===print item to purchase===
   
   public void printItemPurchase() {
      System.out.println(itemName + " " + itemQuantity +  " @ " + "$" + itemPrice +
                " = $" + (itemPrice * itemQuantity));
   }
}
