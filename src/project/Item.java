package project;

public class Item {
    private String itemID;
    private double itemprice;
    public void setMerit(String d,double p)
    {
        this.itemID = d;
        this.itemprice = p;
    }
    public String getItemID()
    {
        return this.itemID;
    }
    public double getItemprice()
    {
        return this.itemprice;
    }
}
