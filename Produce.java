/**
 * Subclass called Produce, superclass is Food, supersuper class is Item
 *
 * @author (Jenny Bi)
 * @version (May 8, 2026)
 */
public class Produce extends Food
{
    //J instance variables
    private boolean bolLocal;
    private byte bytDaysExpired; //J this shows days until expiry, etc -1 is 1 day until expiry
    private float fltWeight; //J weight in pounds
    
    //J conversion method
    public float weightToPrice()
    {
        return this.fltPrice*fltWeight;
    }
    
    //J Default Constructor
    Produce()
    {
        super();
        this.bolLocal = false;
        this.bytDaysExpired = 127;
        this.fltWeight = -1;
    }
    //J Constructor
    Produce(boolean l, byte d, float w, String e, String n, float p, byte a)
    {
        super(e, n, p, a);
        this.bolLocal = l;
        this.bytDaysExpired = d;
        this.fltWeight = w;
    }
    
    //J getters and setters
    void setLocal(boolean l)
    {
        this.bolLocal = l;
    }
    void setDaysExpired(byte d)
    {
        this.bytDaysExpired = d;
    }
    void setWeight(float w)
    {
        this.fltWeight = w;
    }
    public boolean getLocal()
    {
        return this.bolLocal;
    }
    public byte getDaysExpired()
    {
        return this.bytDaysExpired;
    }
    public float getWeight()
    {
        return this.fltWeight;
    }
}