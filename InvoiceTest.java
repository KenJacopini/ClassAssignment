import java.util.Scanner;

public class InvoiceTest{

    public static void main(String[] args){

        Invoice car = new Invoice("UG60", "Bentley", 50, 10 );

        System.out.printf("%s %s %d %.2f %n",
         car.getNumber(), car.getDescription(), car.getQuantity(), car.getItem());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter quantity :");
        int quantity = input.nextInt();

        System.out.print("Enter item: ");
        double item = input.nextDouble();

        car.setQuantity(quantity);
        car.setItem(item);

        System.out.printf("%.1f%n", car.getInvoiceAmount());

        input.close();
    }


}