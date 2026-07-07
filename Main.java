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
        System.out.println("Add Product selected.");
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