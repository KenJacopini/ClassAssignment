public class Invoice{
    private String number;
    private String description;
    private int quantity;
    private double item;

    public Invoice(String number, String description, int quantity, double item){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.item = item;


    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
        
    }
    public int getQuantity(){
        return quantity;
    }
    public void setItem(double item){
        this.item = item;
    }
    public double getItem(){
        return item;
    }
    public double getInvoiceAmount(){
        double invoiceAmount = 0;
        if(quantity < 0){
            quantity = 0;
            return invoiceAmount;}
        if(item < 0){
            item = 0;
            return invoiceAmount;}
        invoiceAmount = item * quantity;
        return invoiceAmount;
    }
    



}