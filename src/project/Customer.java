package project;

public class Customer {
    
    private  String customername;
    private String customerID;
    private int contactNo;
    public void setIdentity(String n,String i,int c)
    {
        this.customername = n;
        this.customerID = i;
        this.contactNo = c;
        
    }
    public String getcustomername()
    {
        return this.customername;
    }
    public String getcustomerID()
    {
        return this.customerID;
    }
    public int getcontactNo()
    {
        return this.contactNo;
    }
            public void displayCustomer()
    {
        System.out.println("Customer Information : ");
        System.out.println("Customername : "+getcustomername());
        System.out.println("CustomerID : "+getcustomerID());
        System.out.println("Customer contactNo : "+getcontactNo());
        
    }
}
