/**
 * Item class, class to build item objects which hold at least a name and price
 *
 * @author (Razan Sherif)
 * @version (08/05/26)
 */
public class Item
{
    //R instance variables
    String strName;
    float fltPrice;
    
    //R default constructor
    public Item()
    {
       this.strName = "No name";
       this.fltPrice = 0.00f;
    }
    
    //R constructor
    public Item(String n, float p)
    {
       this.strName = n;
       this.fltPrice = p;
    }
}