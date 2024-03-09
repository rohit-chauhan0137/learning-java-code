import java.util.Scanner;

class Arra{
public static void main(String[] args) {
    String []Arr={"Sunday","Mondaay","Tuesday","Wensday","Thusdat","Friday"};
        for(String b:Arr){
System.out.println("Enter Your Choice Day");
System.out.println("YOU Enter number BETWEEN 1 TO 7 FOR GOOD DAY  ");
        }
        Scanner s=new Scanner(System.in);
    int  Arra=s.nextInt();
switch (Arra)
 {
    case 1 :
        {
       System.out.println("Today is Sunday  :");}
        break;
        case 2:
        {
       System.out.println("Today is Monday :");}
        break;
        case 3 :
        {
       System.out.println("Today is Tuesday :");}
        break;
        case  4:
        {
       System.out.println("Today is Wensday  :");}
        break;
        case 5:
        {
       System.out.println("Today is Thousday  :");}
        break;
        case 6:
        {
       System.out.println("Today is Friday  :");}
        break;
        case 7:
        {
       System.out.println("Today is  Sartarday :");}
        break;
    default:{System.out.println("Invalid Input ...");}
        break;
}
    }
}

