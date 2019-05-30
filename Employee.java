public class Employee{

    private String firstName;
    private String lastName;
    private int year;
    private double salary;

    public Employee(String firstName, String lastName, int year, double salary){

        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;

        if(salary > 0)
        this.salary = salary;

    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setSalary(double salary){
        if(salary < 0)
            salary = 0;
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    

}