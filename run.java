import java.util.Scanner;
/**
 * Ask User name,password.Create object using that input.  Save that information using fileIO. If User Account (Name) Already Exists,check if the password is saved in a txt file matching the password the user is inputting. 
See if previous data exist or not,if exist using those data inside,recreate the object and save that into ArrayList
Ask the user what they want to purchase,and create object using those information
After all the items are entered,save those information into 1 text file. 
In the end,ask if the user wants to purchase the things in the shopping cart or not. If yes delete all the txt file that contains item user wanted to purchase

 *
 * @author (Samuel Zhu)
 * @version (2026/05/08)
 */

public class run
{
    //Samuel : create a 2D Array that will be used to output category and item in each category
    String[][] aItemList = {
        
        {"Food","Furniture","Clothes","Electronic Device"},
        {"Apple","Banana","Candy"},
        {"Chair","Table","Desk"},
        {"Shirt","pants","jacket"},
        {"PC","phone","VR"}
    
    };
    
    //Samuel - Create 2 byte that store index for category and item
    byte bytIndexC;
    byte bytIndexI;
    
    //Samuel - run method
    public void Input(){
        //Samuel : output the list of category
        System.out.println("Please Enter Cateogry of the item you want:\n");
        for(byte i = 0; i < aItemList[0].length;i++){
            System.out.println((i+1)+") " + aItemList[0][i] + "\n");
        }
        
        
        //Samuel : make a try catch
        //S: ask for input
        try{
        bytIndexC = new Scanner(System.in).nextByte();
        }
        catch (Exception e){
            Input();
        }
        //Samuel : output the list of item in category that user chooses
        System.out.println("Please Enter item you want:\n");
        for(byte i = 0; i < aItemList[bytIndexC].length;i++){
            System.out.println((i+1)+") " + aItemList[bytIndexC][i] + "\n");
        }
        
        //Samuel : make a try catch
        //S: ask for input
        try{
        bytIndexI = new Scanner(System.in).nextByte();
        }
        catch (Exception e){
            Input();
        }
        
        //S: output a message to ask user amount user wants to purchase
        System.out.println("Please Enter Amount you want to purchase:\n");
        //Samuel : make a try catch
        //S: ask for input
        try{
        bytIndexI = new Scanner(System.in).nextByte();
        }
        catch (Exception e){
            Input();
        }
    }
        
}
