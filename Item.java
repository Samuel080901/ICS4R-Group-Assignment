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
    float fltPrice; //for produce this is price per pound
    byte bytItemAmount;
    
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
}