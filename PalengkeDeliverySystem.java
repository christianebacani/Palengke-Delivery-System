// Palengke Delivery System
// Created by : Christiane A. Bacani
import java.util.Scanner;
public class PalengkeDeliverySystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int priceMeats[] = {200,250,300};
        int priceFruits[] = {50,60,70};
        int priceVegetables[] = {120,130,140};
        boolean order = true;
        
        
        System.out.print("Welcome to Online Palengke Delivery!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        while(order){
        System.out.print("Choose what to buy!\n");
        
        System.out.print("1.) Meats\n2.) Fruits\n3.) Vegetablesn\n4.) Exit\n");
        System.out.print("Enter your choice : ");
        String choice = input.nextLine();
        
        if(choice.equals("1")){
            System.out.print("1.) Chicken\n2.) Beef\n3.) Pork\n");
            
            System.out.print("Enter your choice here : ");
            int choose = input.nextInt();
            
            System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            
            int total = priceMeats[choose - 1] * quantity;
            
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            System.out.print("Change : P " + change + "\n");
            
            input.nextLine();
            System.out.print("Do you want to buy more? (y/n) : ");
            String buyMore = input.nextLine();
            
            if(buyMore.equalsIgnoreCase("n")){
                order = false;
                System.out.print("\n\nYOUR ORDER IS ON THE WAY--\n");
                System.out.print("THANK YOU, PLESAE COME AGAIN!");
            }
            
        }
        else if(choice.equals("2")){
            System.out.print("1.) Banana\n2.) Orange\n3.) Grapes\n");
            
            System.out.print("Enter your choice here : ");
            int choose = input.nextInt();
            
            System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            
            int total = priceFruits[choose - 1] * quantity;
            
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            System.out.print("Change : P " + change + "\n");
            
            input.nextLine();
            System.out.print("Do you want to buy more? (y/n) : ");
            String buyMore = input.nextLine();
            
            if(buyMore.equalsIgnoreCase("n")){
                order = false;
                System.out.print("\n\nYOUR ORDER IS ON THE WAY--\n");
                System.out.print("THANK YOU, PLESAE COME AGAIN!");
            }
            
        }
        else if(choice.equals("3")){
            System.out.print("1.) Cabbage\n2.) Carrots\n3.) Pumpkins\n");
            
            System.out.print("Enter your choice here : ");
            int choose = input.nextInt();
            
            System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            
            int total = priceVegetables[choose - 1] * quantity;
            
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            System.out.print("Change : P " + change +"\n");
            
            input.nextLine();
            System.out.print("Do you want to buy more? (y/n) : ");
            String buyMore = input.nextLine();
            
            if(buyMore.equalsIgnoreCase("n")){
                order = false;
                System.out.print("\n\nYOUR ORDER IS ON THE WAY--\n");
                System.out.print("THANK YOU, PLESAE COME AGAIN!");
          
            }
        }
        else if(choice.equals("4")){
            System.out.print("\n\nTHANK YOU, PLESASE COME AGAIN!");
        }
        else{
            System.out.print("\n\nINVALID CHOICE!");
        }
        
        }
            
            
            
            
            
        
        
        
        
            
        
        
        
    }
}
