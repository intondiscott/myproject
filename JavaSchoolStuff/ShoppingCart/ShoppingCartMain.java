import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1"); // -------------------|\
      System.out.println("Enter the item name: "); //-----| \ Sets the user a series of commands to input next
      System.out.println("Enter the item price: "); //----| /
      System.out.println("Enter the item quantity: "); //-|/
      System.out.println();
      
      // Get item 2 details from user, create itemToPurchase object
      System.out.println("Item 2"); // -------------------|\
      System.out.println("Enter the item name: "); //-----| \ Sets the user a series of commands to input next
      System.out.println("Enter the item price: "); //----| /
      System.out.println("Enter the item quantity: "); //-|/
      item1.setName(scnr.nextLine());
      item1.setPrice(scnr.nextInt());
      item1.setQuantity(scnr.nextInt());
      scnr.nextLine(); // --> Adding the ablity for next item's input
      item2.setName(scnr.nextLine());
      item2.setPrice(scnr.nextInt());
      item2.setQuantity(scnr.nextInt());
      
      // Add costs of two items and print total
      System.out.println(); // --> creating a new line
      System.out.println("TOTAL COST"); //----|\
      item1.printItemPurchase(); //-----------| \ Prints out everything related to total cost
      item2.printItemPurchase(); //-----------| /
      System.out.println(); //----------------|/
      int totalCost = (item1.getPrice()*item1.getQuantity()) + (item2.getPrice()*item2.getQuantity());
      System.out.print("Total: " + "$" + totalCost + "\n");
      return;
     }
   }