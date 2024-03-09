
import java.util.Scanner;
public class Bank {
   private double bal=543569;
   private int pwd;
   public void Deposote(double money) {
    System.out.println("Enter Password :");
    Scanner s =new Scanner(System.in);
pwd=s .nextInt();
if(pwd==123){
    bal=bal+money;
    System.out.println("Deposite Money"+money);
    System.out.println("Total Bailance:"+bal);
}
else{
    System.out.println(" Oh Incorect Pssword .....");
}
}

public void Withdraw(double money) {
    System.out.println("Enter Password :");
    Scanner s =new Scanner(System.in);
pwd=s.nextInt();
if(pwd==123){
    bal=bal+money;
    System.out.println("Deposite Money"+money);
    System.out.println("Total Bailance:"+bal);
}
else{
    System.out.println(" Oh Incorect Pssword .....");
}
}
public void checkBal() {
    System.out.println("Enter Password :");
    Scanner s2 =new Scanner(System.in);

pwd=s2.nextInt();
if(pwd==123){
    System.out.println("Total Balance"+bal);
}
}
 class Costomet {
    public static void main(String[] args) {
      Bank b=new Bank();  

int ch;
System.out.println("1.Deposite");
System.out.println("2.withdraw");
System.out.println("3.checkBal");


System.out.println("\nEnter Your choce: ");
Scanner s2 =new Scanner(System.in);
  ch=s2.nextInt();
switch (ch) {
      case 1:b. Deposote(1000);
      break;
      case 2:b.Withdraw(435);
      break;
      case 3:b.checkBal();
      break;
      default:System.out.println("Invalid choice");
    }
 }
}
}