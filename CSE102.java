import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
public class CSE102
{
public static void main(String[] args){

    String wr = "Wrong Entrence !! reRun the Program";
    Scanner kb = new Scanner (System.in);
    
    System.out.println("Welcome to to My CSE102 project");
    System.out.println("To ENTER the DashBoard please Write DS : ");
    
String entrence = kb.nextLine();
if (entrence.equals("DS") || entrence.equals("ds")){
System.out.println("welcome to DashBoard Choose a number");
System.out.println("1   Calculator ");
System.out.println("2   Create a Password");
}
else { System.out.println(wr);}

int swtc = kb.nextInt();
switch(swtc) {

    case 1 :
     System.out.println("Give me to numbers :");
    break;

    default:
    System.out.println(wr);




}





    
    
    
    
    

}
}