/**
 * Item class, class to build item objects which hold at least a name and price
 *
 * @author (Razan Sherif)
 * @version (08/05/26)
 */
import java.time.LocalDate;
import java.io.Serializable;
public class Item implements Serializable
{
    //R instance variables
    String strName;
    float fltPrice; //for produce this is price per pound
    byte bytItemAmount;
    LocalDate DateMade = LocalDate.now();
    
    //R default constructor
    public Item()
    {
       this.strName = "No name";
       this.fltPrice = 0.00f;
       this.bytItemAmount = 0;
    }
    
    //R constructor
    public Item(String n, float p,byte i)
    {
       this.strName = n;
       this.fltPrice = p;
       this.bytItemAmount = i;
    }
    
    //J made getters and setters
    public String getName()
    {
        return this.strName;
    }
    public float getPrice()
    {
        return this.fltPrice;
    }
    public byte getAmount()
    {
        return this.bytItemAmount;
    }
    public void setName(String n)
    {
        this.strName = n;
    }
    public void setPrice(float p)
    {
        this.fltPrice = p;
    }
    public void setAmount(byte a)
    {
        this.bytItemAmount = a;
    }
}