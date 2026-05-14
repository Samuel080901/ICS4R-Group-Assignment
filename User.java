import java.util.*;
import java.io.*;
/**
 * user class, which stores all methods related to user like login/sign up
 * stoeres user's username, password, and accountnumber and prints out to user-specific file
 *
 * @author (Razan Sherif)
 * @version (May 11)
 */
public class User
{
    //R user class store username and password
    //R code method that writes to a user's file their name password 
    //R and what theyve bought

    static String strUsername;
    private static String strPassword, strConfirmPassword, strPasswordOnFile;
    private static long lngAccountNum;
    
    public static void main(String[] args)
    {
        logIn();
    }

    //R contrsuctors
    public User()
    {
        this.strUsername = "undeclared user";
        this.strPassword = "";
        this.lngAccountNum = 0000000;
    }

    public User(String u, String p, long n)
    {
        this.strUsername = u;
        this.strPassword = p;
        this.lngAccountNum = n;
    }

    //R getters and setters for private variables
    public static void setPassword(String p)
    {
        strPassword = p;
    }

    public static void setAccountNum()
    {
        lngAccountNum = (long)((Math.random()*10000000) + 1);
    }
    
    public String getUsername()
    {
        return strUsername;
    }
    
    public String getPassword()
    {
        return strPassword;
    }

    public String getAccontNum()
    {
        return strPassword;
    }

    //R log in method for users--new and old
    public static String logIn()
    {
        //pre-building scanner and file io objects for later use
        Scanner userInput = new Scanner(System.in);
        PrintWriter out;
        BufferedReader in;

        try 
        {
            //R asking user for username
            System.out.println("please enter username");
            strUsername = userInput.next();

            //R checking if user file exists
            if (new File(strUsername + ".txt").exists())
            {
                //R if so, use bufferedreader to read password on second line of the file
                in = new BufferedReader(new FileReader(strUsername + ".txt"));
                in.readLine();
                strPasswordOnFile = in.readLine();
                lngAccountNum = Long.parseLong(in.readLine());

                //R asking user for password
                System.out.println("Please enter your password");
                strPassword = userInput.next();

                //loop to keep prompting user until theuy enter correct password
                while (strPassword.equals(strPasswordOnFile) != true)
                { 
                    System.out.println("Incorrect Passowrd, try again");
                    strPassword = userInput.next();
                }
                
                User oldUser = new User (strUsername, strPasswordOnFile, lngAccountNum);
                //R nice message
                System.out.println("Welcome back, " + strUsername);
            }
            else
            {
                //R if a file for the user does NOT exist, ask user for password
                System.out.println("Seems youre a new user, please set your password");
                strPassword = userInput.next();

                //R prompting user to enter password again until it matches the password they set
                do
                { 
                    System.out.println("Confirm password");
                    strConfirmPassword = userInput.next();
                }while (strPassword.equals(strConfirmPassword) != true);

                //setting private variable to user's password
                setPassword(strPassword);
                setAccountNum();
                System.out.println("Welcome, " + strUsername);
            }

            //printing out username and password to keep on file
            out = new PrintWriter(new FileWriter(strUsername + ".txt"), true);
            out.println(strUsername);
            out.println(strPassword);
            out.println(lngAccountNum);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");  
        }

        catch (IOException e)
        {
            System.out.println("Error writing to file");
        }
        
        return strUsername;
    }

    public String toString()
    {
        return this.strUsername + "\t Account Number: " + this.lngAccountNum;
    }
}