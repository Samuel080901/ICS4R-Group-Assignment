
/**
 * Electronic device class with storage, wifi and size instance variables.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectronicDevice extends Item
{
    // instance variables - replace the example below with your own
    short shrStorage;
    boolean bolNeedsWifi;
    float fltScreenSize;

    public ElectronicDevice()
    {
        // initialise instance variables
        super();
        this.shrStorage = 0;
        this.bolNeedsWifi = true;
        this.fltScreenSize = 0.0f;
    }

    public ElectronicDevice(String n, float p, short st, boolean w, float ss)
    {
        // initialise instance variables
        super(n, p);
        this.shrStorage = st;
        this.bolNeedsWifi = w;
        this.fltScreenSize = ss;
    }
}