import java.util.Scanner;

public class AccountTest{

    public static void main(String[] args){

        Account account1 = new Account("Ken Granero", 70.00);
        Account account2 = new Account("Sophia Turner", -5.99);
        

        System.out.printf("%s Balance is %.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s Balance is %.2f%n",account2.getName(), account2.getBalance());
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double depositAmount = input.nextDouble();

            account1.deposit(depositAmount);

        System.out.print("Enter amount: ");
         depositAmount = input.nextDouble();

            account2.deposit(depositAmount);

        System.out.printf("%s balance: $ %.2f %n"
        ,account1.getName(), account1.getBalance() );

        System.out.printf("%s balance: $ %.2f %n%n"
        ,account2.getName(), account2.getBalance() );

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = input.nextDouble();

            account1.withdraw(withdrawAmount);

        System.out.print("Enter withdrawal amount: ");
        withdrawAmount = input.nextDouble();

            account2.withdraw(withdrawAmount);

        




        System.out.printf("%s balance: $ %.2f %n"
        ,account1.getName(), account1.getBalance() );

        System.out.printf("%s balance: $ %.2f %n%n"
        ,account2.getName(), account2.getBalance() );


        
        input.close();
    }
}