import java.util.Scanner;

/**
 * Customization class is responsable for getting user input and returning it for various coffee and tea customizations
 * @author Maximo Avalone
 * @version 1
 *
 */
public class Customization {


    /**
     * asks user if coffee has caffine or not
     * @return true or false
     */
    public static boolean caffine(){
        System.out.println("Would You like Caffine? (Enter yes/no)");
        boolean hasCaffine = false;
        Scanner input = new Scanner(System.in);

        while (true) {

            String temp = input.next();

            if (temp.equalsIgnoreCase("yes")) {
                hasCaffine = true;
                System.out.println("Your drink will have caffine");
                break;

            } else if (temp.equalsIgnoreCase("no")) {
                hasCaffine = false;
                System.out.println("Your drink is decaf");
                break;

            } else {
                System.out.println("Invalid Input, please try again.");
            }
        }

        return hasCaffine;
    }

    /**
     * returns user answer for if coffee will have foam or not
     * @return true or false
     */
   public static boolean foam(){

       System.out.println("Would you like your drink to have foam? (yes/no)");
        boolean hasFoam = false;
       Scanner input = new Scanner(System.in);

        while (true) {

           String temp = input.next();

           if (temp.equalsIgnoreCase("yes")) {
               hasFoam = true;
               System.out.println("Your drink will have foam");
               break;

           } else if (temp.equalsIgnoreCase("no")) {
               hasFoam = false;
               System.out.println("Your drink will not have foam");
               break;

           } else {
               System.out.println("Invalid Input, please try again.");
           }
       }

        return hasFoam;
   }

    /**
     *  asks user for the size of their coffee
     * @return string for value of size
     */
    public static String size(){
        System.out.println("What size drink would you like? (Short/Long)");
        String size = null;
        Scanner input = new Scanner(System.in);

        while (true) {

            String temp = input.next();

            if (temp.equalsIgnoreCase("long")) {
                size = "Long";
                System.out.println("The size of your drink will be long");
                break;

            } else if (temp.equalsIgnoreCase("short")) {
                size = "Short";
                System.out.println("The size of your drink will be short");
                break;

            } else {
                System.out.println("Invalid Input, please try again.");
            }
        }

        return size;
    }

    /**
     * asks user for the heat of their coffee
     * @return iced normal extra hot
     */
    public static String heat(){
        System.out.println("How hot would you like your drink? (Iced, Normal or Extra Hot?)");

        String heat = null;
        Scanner input = new Scanner(System.in);

        while (true) {
            String temp = input.nextLine();

            if (temp.equalsIgnoreCase("iced")){
                heat = "Iced";
                System.out.println("Your drink will be iced.");
                break;
            } else if (temp.equalsIgnoreCase("normal")) {
                heat = "Normal";
                System.out.println("Your drink will be Normal temperature.");
                break;
            } else if (temp.equalsIgnoreCase("extra hot")) {
                heat = "Extra Hot";
                System.out.println("Your drink will be Extra Hot.");
                break;
            } else {
                System.out.println("Invalid Input, Please try again.");
            }
        }
        return heat;
    }


    /**
     * asks user for the strength of their coffee
     * @return single double
     */
    public static String strength(){
        System.out.println("What strength would you like your coffee to be (Single/Double)?");

        String strength = null;
        Scanner input = new Scanner(System.in);

        while (true) {
            String temp = input.next();

            if (temp.equalsIgnoreCase("single")){
                strength = "Single";
                System.out.println("Your drink will be made with a single shot.");
                break;
            } else if (temp.equalsIgnoreCase("double")) {
                strength = "Double";
                System.out.println("Your drink will be made with a double shot.");
                break;
            }  else {
                System.out.println("Invalid Input, Please try again.");
            }
        }
        return strength;
    }

    /**
     * asks user for their milk type for their coffee
     * @return no fat half and half whole almond and soy
     */
    public static String milk(){
        System.out.println("What kind of milk would you like in your drink?");
        System.out.println("The options are: no fat, half and half, whole, almond and soy.");

        Scanner input = new Scanner(System.in);
        String milk = null;

        while (true) {
            String temp = input.nextLine();

            if (temp.equalsIgnoreCase("no fat")){
                milk = "No Fat";
                System.out.println("Your drink will be made with No Fat milk.");
                break;
            } else if (temp.equalsIgnoreCase("whole")) {
                milk = "Whole";
                System.out.println("Your drink will be made with whole milk.");
                break;
            } else if (temp.equalsIgnoreCase("half and half")) {
                milk = "Half and half";
                break;
            } else if (temp.equalsIgnoreCase("almond")) {
                milk = "Almond";
                System.out.println("Your drink will be made with Almond milk.");
                break;
            } else if (temp.equalsIgnoreCase("soy")) {
                milk = "Soy";
                System.out.println("Your drink will be made with Soy milk.");
                break;
            } else {
                System.out.println("Invalid Input, Please try again.");
            }
        }
        return milk;
    }

    /**
     * asks user how much chocolate they want in their coffee
     * @return full or half
     */
    public static String chocolate(){
        System.out.println("How much chocolate would you like in your drink. (Full or Half)");
        String choc = null;
        Scanner input = new Scanner(System.in);

        while (true) {

            String temp = input.next();

            if (temp.equalsIgnoreCase("full")) {
                choc = "Full";
                System.out.println("Your drink will full amount of chocolate");
                break;

            } else if (temp.equalsIgnoreCase("half")) {
                choc = "Half";
                System.out.println("Your drink will have half amount of chocolate");
                break;

            } else {
                System.out.println("Invalid Input, please try again.");
            }
        }
        return choc;
    }

    /**
     * asks user for their coffees sweetness value
     * @return 100% 50% or 25%
     */
    public static double sweetness(){
        System.out.println("How sweet would you like your drink to be?");
        System.out.println("Enter 100%, 50% or 25%.");
        double sweetness = 0;
        Scanner input = new Scanner(System.in);

        while (true) {

            String temp = input.next();

            if (temp.equalsIgnoreCase("100%")) {
                sweetness = 1.0;
                System.out.println("Your drink will have 100% sweetness");
                break;

            } else if (temp.equalsIgnoreCase("50%")) {
                sweetness = 0.5;
                System.out.println("Your drink will have 50% sweetness");
                break;

            } else if (temp.equalsIgnoreCase("25%")) {
            sweetness = 0.25;
            System.out.println("Your drink will have 25% sweetness");
            break;

            } else {
                System.out.println("Invalid Input, please try again.");
            }
        }
        return sweetness;
    }

    /**
     * asks user for whether they want lemon or not
     * @return true or false
     */
    public static boolean lemon(){
        System.out.println("Would You like Lemon? (Enter yes/no)");
        boolean hasLemon = false;
        Scanner input = new Scanner(System.in);

        while (true) {

            String temp = input.next();

            if (temp.equalsIgnoreCase("yes")) {
                hasLemon = true;
                System.out.println("Your drink will have lemon");
                break;

            } else if (temp.equalsIgnoreCase("no")) {
                hasLemon = false;
                System.out.println("Your drink will not have lemon");
                break;

            } else {
                System.out.println("Invalid Input, please try again.");
            }
        }

        return hasLemon;
    }

}
