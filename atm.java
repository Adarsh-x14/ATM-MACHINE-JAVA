import java.util.*;
class password{
    int pass;

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
    
}
public class atm{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        password z = new password();

        
        
        
        int balance = 1000;
        int choice =0;
        int deposit = 0;
        int withdraw;
        int pass1 =1234;
        int attempt = 0;
       
        
        
        while(attempt < 3){
            
            System.out.println("Enter ATM pin");
            int pin = sc.nextInt();
            
            if(pass1 == pin){
                System.out.println("\n\nMENU \n");
                
        System.out.println("Enter the button");
        System.out.println("1 ---> cheak balance \n2 ---> deposit  \n3 ---> withdraw  \n4 ---> Change pin \n5 ---> exit !");

        while (true){
            choice = sc.nextInt();
            
            if(choice == 1){
                System.out.println("Balance = "+balance+"\n");
            }
            else if(choice == 2){
                System.out.println("Enter deposite amount ");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println();
                
                
            }
            else if(choice == 3){
                System.out.println("Total balance = "+balance);
                System.out.println("Enter Withdraw amount \n");
                withdraw = sc.nextInt();
                if(balance<withdraw){
                    System.out.println("ERROR");
                }else{
                    balance = balance-withdraw;
                    System.out.println("Withdraw successfull \n");
                    System.out.println("The remaining balance "+balance+"\n");
                    
                }
                
            }
            else if(choice == 4){
                System.out.println("Enter your new pin");
                 z.setPass(sc.nextInt());
                System.out.println("password changed successfull\n");
                pass1 = z.pass;
                break;
                

            }
           
            else if(choice == 5){
                System.out.println("Exit \n");
                break;
            }
            else if(choice < 1 || choice > 4){
                System.out.println("Invalid input");
            }  
                   
            }
         }
         else{
          System.out.println("Access denied\n");
          attempt++;
          }
        }

        if (attempt==3){
       System.out.println("\nattempt 3 wrong attempt card has been blocked\n");
       }

       
       
    }
}