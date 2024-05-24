import java.util.Scanner;

public class basicBankApp{
static final String USERNAME="user";
static final String PASSWORD="1234";
static double accountBalance=0;
  
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
/*we got password and username from user for authenticating*/
while (true) {
    System.out.print("USERNAME:");
    String username=sc.nextLine();
    System.out.print("PASSWORD:");
    String password=sc.nextLine();
    if (authenticateUser(username,password))
      break;    
}
/*user should enter number between 1 and 4 in a menu if do not it will be invalid choice*/
while (true){
    printMenu();
    int choice=sc.nextInt();
    if(!(choice<5 && choice>0)){
        System.out.println("Invalid choice");     
 } else{
 switch(choice){
     case 1:
       depositMoney();
     case 2:
       withDraw();
     case 3:
       checkBalance();
     case 4:
    System.exit(0);
     break;
}             
}
}
 }
    /*if entered username and password equal to final username and password user can login to system */
 public static boolean authenticateUser(String username,String password){
  if (username.equals(USERNAME) && password.equals(PASSWORD) ){
    System.out.println("your login is succesfull");  
 return true;   
 }else {
   System.out.println("please try again");
 return false ;    
 }
 }
public static void printMenu(){
    System.out.println("\n--- Bank application ---");   
    System.out.println("1.deposit money");
    System.out.println("2.withdraw money");
    System.out.println("3.check account balance");
    System.out.println("4.exit");
    System.out.print("Your choice:");            

} 
public static void depositMoney(){
    /*last accountbalance will add deposit*/
    System.out.print("enter the amount to deposit:");
    Scanner sc= new Scanner (System.in);
    int deposit=sc.nextInt();
    accountBalance=accountBalance+deposit;
    System.out.println("Deposit successful.New Balance is:"+accountBalance);
} 
public static void withDraw(){
    System.out.print("enter the amount to withdraw:");
    Scanner sc=new Scanner (System.in);
    int withdraw=sc.nextInt();
if(accountBalance<withdraw){
    /*if users want to get much more money them have system will error*/
    System.out.println("Insufficent balance.You do not have enough money to withdraw ");
 } else{
accountBalance=accountBalance- withdraw;
    System.out.println("Withdraw succesful.Your new balance is:"+ accountBalance);
}
}
    
public static void checkBalance(){
    System.out.println("Account Balance:"+accountBalance);   
}    
    
}

