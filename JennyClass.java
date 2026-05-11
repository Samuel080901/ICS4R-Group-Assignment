/**
 * Description: Temporary class for coding the bottom part of the flowchart. When completed, will
 *              be moved to the run class.
 *              - prompts user to purchase or to leave without checkout
 *              - if checkout, then:
 *                     - ask for credit card number
 *                     - output the receipt
 *                     - delete the file we use to save this user's shopping list(if they have one)
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
    
    public static void testMethod()
    {
        byte bytChoice;
        int intCard;
        String strName = "Name here";
        System.out.println("Would you like to purchase or leave?");
        System.out.println(" (if you leave, you can save for next time)");
        System.out.println("  1. purchase     2. leave");
        bytChoice = new Scanner(System.in).nextByte();
        
        ArrayList<String> aExample = new ArrayList<String>();
        aExample.add("Line 1");
        aExample.add("Line 2");
        aExample.add("Line 3");
        
        if(bytChoice == 1)
        {
            //J output list to user to confirm purcahse
            System.out.println("Your shopping list contains: ");
            for (String i:aExample)
            {
                System.out.println(i);
            }
            System.out.println("Confirm purchase? 1. y, 2. n");
            bytChoice = new Scanner(System.in).nextByte();
            //J will later add a loop that will proceed if user says 1, if 2, will output:
            //System.out.println("You have chosen not to purchase."), then leave
            
            //J prompting user for credit card info for purchase
            System.out.println("Enter credit card #: ");
            //J parsed this cause it runs error otherwise
            intCard = Integer.parseInt(new Scanner(System.in).nextLine());
            
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
                
                System.out.println("\nHere's your receipt: ");
                System.out.println("---RECEIPT OF SALE---");
                System.out.print("      ");
                for (String i:aExample)
                {
                    System.out.println(i);
                }
                System.out.println(strName);
                System.out.print("THANK YOU FOR PURCHASING AT ESHOP");
            }
        }
        if(bytChoice ==2)
        {
            
        }
    }
    
    
}