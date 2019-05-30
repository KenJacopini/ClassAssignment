import java.util.Scanner;

public class AccountTest2{

    public static void main(String[] args){

        Account2 account1 = new Account2("Ken Granero", 70.00);
        Account2 account2 = new Account2("Sophia Turner", -5.99);
        account1.name = 0;
        //String str1 = account1.getName() + account1.getBalance();
        //String str2 = account1.getName() + account1.getBalance();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double depositAmount = input.nextDouble();

            account1.deposit(depositAmount);

        System.out.print("Enter amount: ");
         depositAmount = input.nextDouble();

            account2.deposit(depositAmount);
        
        System.out.println(account1.displayAccount())

    }
     
        
    

}
