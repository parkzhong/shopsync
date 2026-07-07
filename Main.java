import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do{
      System.out.println("===== ShopSync =====");
      System.out.println("1. Add Product");
      System.out.println("2. View Product");
      System.out.println("3. Exit");

      System.out.print("Choose option: ");
      choice = scanner.nextInt();
      
      if (choice == 1) {
        System.out.print("Add Product selected.");
        scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter parent SKU: ");
        String parentSKU = scanner.nextLine();

        System.out.print("Enter stock: ");
        int stock = scanner.nextInt();

        System.out.print("Enter cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter selling price: ");
        double sellingPrice = scanner.nextDouble();

        System.out.println("Product added:");
        System.out.println("Name: " + productName);
        System.out.println("Parent SKU: " + parentSKU);
        System.out.println("Stock: " + stock);
        System.out.println("Cost Price: RM" + costPrice);
        System.out.println("Selling Price: RM" + sellingPrice);

      } else if (choice == 2) {
        System.out.println("View Product selected.");
      } else if (choice == 3) {
        System.out.println("Exit selected");
      } else {
        System.out.println("Invalid Option.");
      }

      System.out.println();

    } while (choice != 3);

    scanner.close();
  }
}