package project;
import java.util.*;
public class BuyItem extends Item {
    private String buyDate;
    private int quantity;
    public void setBuyDate(String b)
    {
        this.buyDate = b;
    }
    public void setQuantity(int q)
    {
        this.quantity = q;
    }
    public String getbuyDate()
    {
        return this.buyDate;
    }
    public int getquantity()
    {
        return this.quantity;
    }
    public void buy(ArrayList<Item>i)
    {
       System.out.println("Buying Details : ");
       System.out.println("BuyDate : "+getbuyDate());
       System.out.println("Quantity : "+getquantity());
      System.out.println("\n");
         

       for(Item I:i)
       
       {
           
           System.out.println("Buying ItemID : "+I.getItemID());
           System.out.println("Buying Itemprice:"+I.getItemprice()+"taka");
           System.out.println(" \n ");
                 }     
       
    }
    public static void main(String[]args){
        

        Customer t = new Customer();
        t.setIdentity("Tara","299",1808);
        t.displayCustomer();
        System.out.println();
        Customer r = new Customer();
        r.setIdentity("Sara","11111111111111", 9865);
        r.displayCustomer();
        System.out.println();
        Item i1 = new Item();
        i1.setMerit("Laptop",61000);
        
         Item i2 = new Item();
          i2.setMerit("Mobile",2100);
          
          Item i3 = new Item();
          i3.setMerit("Watch",2500);
          
          Item i4 = new Item();
          i4.setMerit("Pendrive", 1500);
          
          Item i5 = new Item();
          i5.setMerit("Wallet",1000);
        

          ArrayList <Item>i = new ArrayList <Item>();
             i.add(i1);
             i.add(i2);
             i.add(i3);
             i.add(i4);
             i.add(i5);
             

             BuyItem a = new BuyItem();
             a.setBuyDate("07-11-2019");
             a.setQuantity(5);
             a.buy(i);
                  
          
                
        
                
        
    }
}
