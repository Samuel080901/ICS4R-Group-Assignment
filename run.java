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
import java.util.ArrayList;
//S: if there is comment with no name with it,its probably mine
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
    
    // S:create a 2D array that will be storing price of each item,use it when create the object
    //the price is temporary
    float[][] aItemPrice = {
        
        {0.01f,0.02f,0.03f,0.04f},
        {0.05f,0.06f,0.07f},
        {0.08f,0.09f,0.1f},
        {0.11f,0.12f,0.13f},
        {0.14f,0.15f,0.16f}
    
    };
    
    //S: create a arraylist tha is used as shopping list
    ArrayList<Item> itemList = new ArrayList<Item>();
    
    //Samuel - run method
    public void Run(){
        //Samuel - Create 2 byte that store index for category and item,intialize to -1 because we need to
        byte bytIndexC = -1;
        byte bytIndexI = -1;
        
        //S: create a byte value that store amount of item user wants to purchase
        byte bytItemAmount;
        
        //S: create temprery variable that will be used to store extra info
        String strTemp1;
        String strTemp2;
        short shrTemp;
        float fltTemp;
        boolean bolTemp = false;
        
        //S:create a do while loop that loop until user enter correct value
        do{
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
                
                bytIndexC = 100;
            }
            //S: code a if statement to output user enter something wrong
            if(bytIndexC <= 0 || bytIndexC > aItemList[0].length){
                //S: clear terminal window
               
                System.out.println("Wrong input");
                
            }
        }while(bytIndexC <= 0 || bytIndexC > aItemList[0].length);
        
        
        
        
        
        //S:create a do while loop that loop until user enter correct value
        do{
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
            
            bytIndexI = 100;
        }
        //S: code a if statement to output user enter something wrong
        if(bytIndexI <= 0 || bytIndexI > aItemList[bytIndexC].length){
            //S: clear terminal window
            
            System.out.println("Wrong input");
            
        }
        }while(bytIndexI <= 0 || bytIndexI > aItemList[bytIndexC].length);
        
        
        
        //S:create a do while loop that loop until user enter correct value
        do{
               //S: output a message to ask user amount user wants to purchase
            System.out.println("Please Enter Amount you want to purchase:\n");
            //Samuel : make a try catch
            //S: ask for input
            try{
                bytItemAmount = new Scanner(System.in).nextByte();
                //S:output a message if user enter negative value
                if(bytItemAmount <= 0){
                    System.out.println("Value needs to be above 0");
                    
                }
            }
            catch (Exception e){
                System.out.println("Wrong input");
                bytItemAmount = -100;
            }
            
        }while(bytItemAmount <= 0 );
        
        
        
        
        
        //S:ask user extra information based on what they choose to buy
        //S: will be done using if statement
        if(bytIndexC == 1){//S:(Food)
            //S: for food we alse need to ask is it produce or not
        
            
            
        }
        else if (bytIndexC == 2){//S:(Furniture)

             
            do{
                //S: output a message to ask user amount user wants to purchase
                System.out.println("Do you want decoration for your furniture (Yes/No)");
                
                
                strTemp1 = new Scanner(System.in).nextLine();
                //S:output a message if user enter negative value
                if(!strTemp1.equalsIgnoreCase("Yes") &&!strTemp1.equals("No")){
                    System.out.println("Enter Yes or No");
                    strTemp1 = "1";
                }
               
                
            }while(strTemp1.equals("1") );
        
            //S:Convert yes or no into true or false
            if(strTemp1.equalsIgnoreCase("Yes")){
                bolTemp  = true;
            }
            else if(strTemp1.equalsIgnoreCase("No")){
                bolTemp  = false;
            }
            
            //create a object using all the input and save that into arralist
            itemList.add( new Furniture(aItemList[bytIndexC][bytIndexI],aItemPrice[bytIndexC-1][bytIndexI],bytItemAmount,bolTemp));
        }    
        
        
            
           
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

        else if (bytIndexC == 3){//S:(Clothes)
            
        
        }
        else if (bytIndexC == 4){//S:(Electronic Device)
            //ask and populate the temp string
            
            
        
        }
        
        
        
        
        
        
        
    }
    
}



