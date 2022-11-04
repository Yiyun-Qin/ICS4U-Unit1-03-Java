import java.util.Scanner;
/**
 * The HelloWorld program implements an application that
 * simply displays energy released question to the standard output.
 *
 * @author      Yiyun Qin
 * @Version 1.0
 * @Since   2022-09-23
 */

class Food {
  public static void main(String[] args) {
    int maxFood = 3;
    int timeSubMinute = 1;
    int timeSubSec = 0;
    int timePizzaMinute = 0;
    int timePizzaSec = 45;
    int timeSoupMinute = 1;
    int timeSoupSec = 45;
    int foodTimeMinute = -1;
    int foodTimeSec = -1;
    String foodType;
    double multipleDouble;
    int multiple;


    Scanner myobj = new Scanner(System.in);
    System.out.print("Which food do you want to heat, sub, pizza or soup?: ");
    foodType = myobj.nextLine();
    System.out.print("How many " + foodType + "(s) are you cooking?(max 3): ");
    String foodNumberString = myobj.nextLine();

    try {
      int foodNumber = Integer.parseInt(foodNumberString);
      if (foodNumber > maxFood) {
        System.out.println("\nThe maximum quantity of food is 3.");
      } else if (foodNumber <= 0) {
        System.out.println("\nPlease enter a positive number!");
      } else {
        if (foodType.equals("sub")) {
          foodTimeMinute = foodNumber * timeSubMinute;
          foodTimeSec = foodNumber * timeSubSec;
        } else if (foodType.equals("pizza")) {
          foodTimeMinute = foodNumber * timePizzaMinute;
          foodTimeSec = foodNumber * timePizzaSec;
        } else if (foodType.equals("soup")) {
          foodTimeMinute = foodNumber * timeSoupMinute;
          foodTimeSec = foodNumber * timeSoupSec;
        } else {
          System.out.println("\nPlease choose a food in options!");
        }
      }
      if (foodTimeMinute >= 0 && foodTimeSec >= 0) {
        if (foodTimeSec >= 60) {
          multipleDouble = foodTimeSec / 60;
          multiple = (int) Math.floor(multipleDouble);
          foodTimeMinute = foodTimeMinute + multiple;
          foodTimeSec = foodTimeSec - multiple * 60;
        }
        System.out.println(
            "\nThe total cook time is " + foodTimeMinute + " minutes and "
            + foodTimeSec + " seconds."
        );
      }
    } catch (Exception e) {
      System.out.println("\nInvalid food number!");
    } finally {
      System.out.println("\nDone.");
    }
  }
}
