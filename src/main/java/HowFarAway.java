import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
       //declare
     double startLat, startLog, endLat, endLog;
      /*
         User enter the four values:
         beginning value of latitude and longitude, and ending value of latitude and
         longitude.
         Then construct a GeoLocation class to be able to use a calculation method.
      */
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the latitude of the starting location: ");
       startLat = in.nextDouble();
       System.out.print("Enter the longitude of the starting location: ");
       startLog = in.nextDouble();
       System.out.print("Enter the latitude of the ending location: ");
       endLat = in.nextDouble();
       System.out.print("Enter the longitude of the ending location: ");
       endLog = in.nextDouble();
       GeoLocation strLocation = new GeoLocation(startLat, startLog);
       System.out.println("The distance is " + strLocation.distanceFrom(new GeoLocation(endLat, endLog)) + " miles.");
    }
}