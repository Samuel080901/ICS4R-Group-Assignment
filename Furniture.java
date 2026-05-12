
/**
 * Write a description of class Furniture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Furniture extends Item
{
    //H - instance variables for the furniture object
    private boolean bolIsDecoration;
    
    //H - constructor for furniture object
    Furniture(String n, float p, byte a, boolean d)
    {
        super(n, p, a);
        bolIsDecoration = d;
    }
    
    
    //H - default constructor for clothes object
    Furniture()
    {
        super();
        this.bolIsDecoration = false;
    }
    
    //H - code for setters in the furniture class
    void setIsDecoration(boolean d){this.bolIsDecoration = d;}
    
    //H - code for getters in the furniture class
    boolean getIsDecoration()
    {
        return this.bolIsDecoration;
    }
    
}