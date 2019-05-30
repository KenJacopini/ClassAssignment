public class EmployeeTest{

    public static void main(String[] args){

        Employee account1 = new Employee("Ken", "Granero", 1995, 50000.00);
        Employee account2 = new Employee("Chris", "Jerry", 1988, 40000.00);

        System.out.printf("First Name: %s%nLast Name: %s%nYear: %d%nSalary: %.2f%n%n",
         account1.getFirstName(), account1.getLastName(), account1.getYear(), account1.getSalary() * 12);
        
        System.out.printf("First Name: %s%nLast Name: %s%nYear: %d%nSalary: %.2f%n%n",
         account2.getFirstName(), account2.getLastName(), account2.getYear(), account2.getSalary() * 12);

        double increase1 = 0;
            increase1 = (account1.getSalary() * 0.10 + account1.getSalary()) * 12; 
        double increase2 = 0;
            increase2 = (account2.getSalary() * 0.10 + account2.getSalary()) * 12;

        account1.setSalary(increase1);
        account2.setSalary(increase2);

        System.out.printf("First Name: %s%nLast Name: %s%nYear: %d%nSalary: %.2f%n%n",
         account1.getFirstName(), account1.getLastName(), account1.getYear(), account1.getSalary());
        
        System.out.printf("First Name: %s%nLast Name: %s%nYear: %d%nSalary: %.2f%n",
         account2.getFirstName(), account2.getLastName(), account2.getYear(), account2.getSalary());

            

        
        
    }
}