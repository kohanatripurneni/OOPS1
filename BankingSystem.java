import java.util.Scanner;

class Bank {
   
  int  balance;
   
   void bal(){
    System.out.println("Balance is: "+balance);
   } 
   void dip(int amount){
    if(amount > 0){
        balance+=amount;
        System.out.println("The balance is:"+balance);
    }
    else {
        System.out.println("Please enter valid amount!!!");
    }
   }
   void with(int amount){
    if (amount >0 && amount<=balance){
    balance-=amount;
    System.out.println(" The balance is:"+balance);
    }
    else {
        System.out.println("Please enter valid amount!!!\n Insufficient balance$$$$$$");
    }
   }
}
class BankingSystem{
    public static void main(String args[]){
        Bank ban = new Bank();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int choice, amount;
        System.out.println(" $ Bank Of Nagpur $");
        int k=13062006;
        int s=8012005;
        int r=28072006;
        int a;
        

        System.out.print("Please enter your account number:  ");
        a=sc.nextInt();

        if (a==k){
            System.out.println("Kohana Tripurneni");
            ban.balance=67000;
            System.out.println("Balance:"+ban.balance);
        }
        else if (a==s){
            System.out.println("Samta Tripurneni");
            ban.balance=68000;
            System.out.println("Balance:"+ban.balance);
        }
        else if (a==r){
            System.out.println("Ruhan Tripurneni");
            ban.balance=104530;
            System.out.println("Balance:"+ban.balance);
        }
        else {
            System.out.println("Please enter valid account number");
        }
        

        

while (true) 
    

            
 {
 System.out.println("     \n");
 System.out.println("1. Check Balance");
 System.out.println("2. Deposit");
 System.out.println("3. Withdraw");
 System.out.println("4. Exit");
 System.out.println("");
 System.out.print("Enter your choice: ");
            
 choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ban.bal();
                    break;
                case 2:
                System.out.print("Enter amount to deposit: ");
                amount = sc.nextInt();
                 ban.dip(amount);
                
                 break;
         case 3:
            System.out.print("Enter amount to withdraw: ");
            amount = sc.nextInt();
            ban.with(amount);
            break;
            case 4:
            break;

                
        default:
            System.out.println("Invalid choice! Please try again.");
            }
           
 }
    }
}