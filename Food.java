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
    String food;

    Scanner myobj = new Scanner(System.in);
    System.out.println("Which food do you want to heat, sub, pizza or soup?: ");
    food = myobj.nextLine();
    System.out.print("How many " + foodType + "(s) are you cooking?(max 3): ");
    foodNumberString = myobj.nextLine();

    try {
      foodNumber = Integer.parseInt(foodNumberString);
      if (foodNumber > maxFood) {
        System.out.println("The maximum quantity of food is 3.");
      } else if (foodNumber <= 0) {
        System.out.println("Please enter a positive number!");
      } else {
        if (food.equals("sub")) {
          foodTimeMinute = foodNumber * timeSubMinute;
          foodTimeSec = foodNumber * timeSubSec;
        } else if (food.equals("pizza") {
          foodTimeMinute = foodNumber * timePizzaMinute;
          foodTimeSec = foodNumber * timePizzaSec;
        } else if (food.equals("soup") {
          foodTimeMinute = foodNumber * timeSoupMinute;
          foodTimeSec = foodNumber * timeSoupSec;
	}
      }
      if (foodTimeMinute >= 0 && foodTimeSec >= 0) {
        System.out.println(
          "The total cook time is " + foodTimeMinute + " minutes and "
	  + foodTimeSec + " seconds."
        );
      }
    } catch (Exception e) {
      System.out.println("Please choose a food in options!");
    } finally {
      System.out.println("\nDone.");
    }
  }
}
