import java.util.*;
import java.io.*;
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    //R user class store username and password
    //R code method that writes to a user's file thei rname password 
    //R and what theyve bought

    static String strUsername;
    private static String strPassword, strConfirmPassword, strPasswordOnFile;

    
    public static void main (String[] args)
    {
        logIn();
    }

    //R getters and setters
    public static void setPassword(String p)
    {
        strPassword = p;
    }
    
    public static String getPassword(String p)
    {
        return strPassword;
    }

    //R log in method for users--new and old
    public static void logIn()
    {
        Scanner userInput = new Scanner(System.in);
        PrintWriter out;
        BufferedReader in;

        System.out.println("please enter username");

        try 
        {
            strUsername = userInput.next();

            if (new File(strUsername + ".txt").exists())
            {
                /*if file exists, read password
                 * compare password on file to passowrd user enters
                 * if same continue , if not keep entering until same
                 * 
                 */
                
                in = new BufferedReader(new FileReader(strUsername + ".txt"));
                in.readLine();
                strPasswordOnFile = in.readLine();
                
                System.out.println("Please enter your password");
                strPassword = userInput.next();

                do
                { 
                    System.out.println("Incorrect Passowrd, try again");
                    strPassword = userInput.next();
                }while (strPassword.equals(strPasswordOnFile) != true);
            }
            else
            {
                System.out.print("Seems youre a new user, please set your password");
                strPassword = userInput.next();

                do
                { 
                    System.out.println("Confirm password");
                    strConfirmPassword = userInput.next();
                }while (strPassword.equals(strConfirmPassword) != true);

                setPassword(strPassword);
            }

            out = new PrintWriter(new FileWriter("strUsername.txt"));
            out.println(strUsername);
            out.println(strPassword);

        }
        catch (FileNotFoundException e)
        {
          System.out.println("File not found");  
        }

        catch (IOException e)
        {
            System.out.println("Error writing to file");
        }

    }
}