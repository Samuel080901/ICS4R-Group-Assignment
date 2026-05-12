/**
 * Description: Temporary class for coding the bottom part of the flowchart. When completed, will
 *              be moved to the run class.
 *        - prompts user to purchase or to leave without checkout
 *              - if checkout, then:
 *                     - ask for credit card number
 *                     - output the receipt
 *                     - delete the file we used to save this user's shopping list(if they have one)
 *              - if leave, then:
 *                     - option to save for next time
 *                     - save the ArrayList to FileIO

 *
 * @author (Jenny Bi)
 * @version (May 11, 2026)
 */
import java.util.*;
import java.io.*;
public class JennyClass
{
    public static void main(String args[])
    {
        testMethod();
    }
    
    //J put everything in 1 method, but during run you can seperate into several
    public static void testMethod()
    {
        //J variables
        byte bytChoice;
        String strChoice;
        int intCard;
        float fltTotal = 0;
        String strName = "Name here";
        
        //J example arraylist, hardcoded. 
        ArrayList<Item> aExample = new ArrayList<Item>();
        aExample.add(new Item("Line 1", (float)(1.1), (byte)(1)));
        aExample.add(new Item("Line 2", (float)(2.2), (byte)(2)));
        aExample.add(new Item("Line 3", (float)(3.3), (byte)(3)));
        
        //J output list to user to confirm purcahse
        //J you can make the output shopping list a new method and use it all over Run
        System.out.println("Your shopping list contains: ");
        for (Item i:aExample)
        {
            System.out.println(i.getAmount()+"    "+i.getName()+"   $"+i.getPrice());
        }
        System.out.println("\nWould you like to purchase or leave?");
        System.out.println(" (if you leave, you can save for next time)");
        System.out.println("  1. purchase     2. leave");
        bytChoice = new Scanner(System.in).nextByte();
        System.out.println("Confirm purchase? 1. y, 2. n");
        bytChoice = new Scanner(System.in).nextByte();
        
        
        if(bytChoice == 1)
        {
            if(aExample.isEmpty())
            {
                System.out.println("The list is empty.");
                System.out.println("You have not purchased anything.");
            }
            else
            {
                //J I learned this for dramatic effect, don't put it if you don't want to
                try
                {
                    //J prompting user for credit card info for purchase
                    System.out.println("Enter credit card #: ");
                    //J parsed this cause it has error otherwise
                    intCard = Integer.parseInt(new Scanner(System.in).nextLine());
                    
                    System.out.print("Processing purchase");
                    Thread.sleep(1000); //J this means wait for 1 sec
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(" .");
                    Thread.sleep(1000);
                    System.out.print(" .");
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Sleep interrupted");
                }
                
                //J output receipt to terminal window
                System.out.println("\nHere's your receipt: ");
                System.out.println("---RECEIPT OF SALE---");
                System.out.println("        ESHOP   ");
                for (Item i:aExample)
                {
                    System.out.println(i.getAmount()+"    "+i.getName()+"   $"+i.getPrice());
                    fltTotal += i.getPrice();
                }
                System.out.println("------------------");
                System.out.println("Total:            "+fltTotal);
                System.out.println(strName);
                System.out.println("------------------");
                System.out.print("THANK YOU FOR PURCHASING AT ESHOP");
                
            }
        }
        if(bytChoice == 2)
        {
            System.out.println("You have chosen not to purchase.");
            System.out.println("Save your items? y/n");
            strChoice = new Scanner(System.in).next();
            if (strChoice.equalsIgnoreCase("y"))
            {
                System.out.println("You have chosen to leave. All cart items are saved for next visit.");
            }
            //J didn't code anything for this since I assume files don't auto delete
            else
            {
                //J delete files of Items
                //J to delete file just NAME.delete(), I didn't put it because it requires making a file first
                System.out.println("You have chosen to leave. All cart items deleted from list.");
            }
        }
    }
    
    
}