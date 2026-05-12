
/**
 * Write a description of class Clothes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clothes extends Item
{
    
    //H - instance variables for clothes object
    private String strType, strBrand;
    
    //H - constructor for clothes object
    

    
    public Clothes(String n, float p, byte a, String t, String b)

    {
        super(n, p, a);
        strType = t;
        strBrand = b;
    }
    
    
    //H - default constructor for clothes object
    Clothes()
    {
        super();
        this.strType = "T-shirt";
        this.strBrand = "No name";
    }
    
    //H - code for setters in clothes class
    void setType(String t){this.strType = t;}
    void setBrand(String b){this.strBrand = b;}
    
    //H - code for getters in the clothes class
    String getType()
    {
        return this.strType;
    }
    String getBrand()
    {
        return this.strBrand;
    }
}