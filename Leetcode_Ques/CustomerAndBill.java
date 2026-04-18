class Customer
{
    int id;
    String name;
    int discount;
    
    public Customer(int id , String name , int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getDiscount(){
        return discount;
    }
     
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    @Override
    public String toString(){
        return name + "(" + id + ")";
    }
}

class Bill
{
    int id;
    Customer customer;
    double amount;
    
    public Bill(int id , Customer customer , double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    
    public int getID(){
        return id;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public void setCustomer(Customer c1){
        this.customer = c1;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public int getCustomerID(){
        return customer.id;
    }
    
    public String getCustomerName(){
        return customer.name;
    }
    
    public int getCustomerDiscount(){
        return customer.discount;
    }
    
    public double getFinalAmt(){
        int discount = getCustomerDiscount();
        double discountAmount = ((double)discount * amount) / 100;
        double finalAmount = amount - discountAmount;
            return finalAmount;
    }
}