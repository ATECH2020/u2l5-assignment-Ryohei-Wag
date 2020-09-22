import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      //declare
     double tax;
     int boardNum, windowNum;
       /*
       ask users these: sales tax, number of boards, and number of windows.
       then construct the Construction class to calculate the total cost, which is
       addition of cost of lumbers(boards) and windows. each one can be calculate
       by using lumberCost and windowCost methods in the Construction class. To find
       grand total cost, use grandTotal method in the Construction class.
       */
       Scanner in  = new Scanner(System.in);
       System.out.println("Enter the sales tax rate:");
       tax = in.nextDouble();
       System.out.println("How many boards do you need?");
       boardNum = in.nextInt();
       System.out.println("How many windows do you need?");
       windowNum = in.nextInt();
       Construction constr = new Construction(8, 11, tax);
       double total = constr.lumberCost(boardNum) + constr.windowCost(windowNum);
       System.out.println("Total: " + total);
       System.out.println("Grand Total: " + constr.grandTotal(total));
    }
}
