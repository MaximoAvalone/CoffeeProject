import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Driver class, Starts the run of the Coffee Shop Program
 *
 * @author Maximo Avalone
 * @version 1
 */
public class Main {


    /**
     * Driver Method, starts the run of the program and calls other methods in order to
     * take the users order and return their receipt.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome! You may order up to 5 drinks in one order!");

        System.out.println("We have proudly served " + FileIO.readOrderNum() + " orders!");

        Coffee[] coffees = new Coffee[4];
        Tea[] teas = new Tea[4];

        for (int orderNumber = 0; orderNumber < 5; orderNumber++) {

            if (orderNumber >= 1) {
                if (!orderAgain(input)) {
                    break;
                }
            }

            //Splits the drink and the drink number into two values
            String drinkTypeAndNumber = determineDrink(input);
            String[] info = drinkTypeAndNumber.split(" ");
            String drinkName = info[0];
            int drinkNum = Integer.parseInt(info[1]);


            // determine if coffee or tea
            if (drinkName.equalsIgnoreCase("coffee")){

                //Coffee test = makeCoffeeOrder(drinkNum);
                //System.out.println(test.toString());
                coffees[orderNumber] = makeCoffeeOrder(drinkNum);
                teas[orderNumber] = null;

            } else {

                teas[orderNumber] = makeTeaOrder(drinkNum);
                coffees[orderNumber] = null;

            }
        }
        // save order list to file
        // create and print their drinks
        // print their recipt and increment order number by 1 for each order
        input.close();

        System.out.println("Preparing your order! Here is your receipt!");
        int numOfOrders = 1;

        FileIO.updateOrderNum(numOfOrders);
        Printer.printReceipt(coffees, teas);
    }


    /**
     * Prompts the user with a menu so they can choose their drink of choice
     * @param input object of Scanner class used for user input.
     * @return method returns a String that will be split into two values, drinkType and drinkNumber
     * @throws RuntimeException if user input is Invalid
     */
    public static String determineDrink(Scanner input){
        assert input != null;
        Printer.printMenu();

        String drinkType = null;
        int drinkNumber = 0;

        while (true) {
            try {
                drinkType = input.next();
                drinkNumber = input.nextInt();
            } catch (InputMismatchException e) {
                throw new RuntimeException("Invalid input");
            }


            if (drinkType.equalsIgnoreCase("coffee")) {

                //makeCoffeeOrder(drinkNumber, input);
                return "coffee " + drinkNumber;


            } else if (drinkType.equalsIgnoreCase("tea")) {

                //makeTeaOrder(drinkNumber, input);
                return "tea " + drinkNumber;

            } else {
                System.out.println("Invalid menu option: Please try again");
            }
        }
    }


    /**
     * Prompts the user whether they would like to order another drink or not (up to five)
     * @param input object of Scanner class used for user input.
     * @return returns true or false based on user input.
     * @throws IllegalArgumentException if user input is incorrect
     */
    public static boolean orderAgain(Scanner input){
        assert input != null;
        String answer = null;
        System.out.println("Would you like to order another drink? (enter yes or no) " +
                "(You may order up to five).");
        answer = input.next();
        if (answer.equalsIgnoreCase("yes")){
            return true;
        } else if (answer.equalsIgnoreCase("no")){
            return false;
        } else {
            throw new IllegalArgumentException("Invalid Input, please read instructions and try again.");
        }


    }


    /**
     * Creates the order based on the input of the user, creates objects with the
     * customizations given by the user.
     * @param number takes in a number used as an identifier for the type of drink to create
     * @return returns a Coffee based on the number.
     * @throws IllegalArgumentException if number is not one of the expected cases.
     */
    public static Coffee makeCoffeeOrder(int number){

        switch (number){
            case 1: // Espresso

                Espresso espresso = new Espresso();

                espresso.setHasCaffeine(Customization.caffine());
                espresso.setSize(Customization.size());
                espresso.setStrength(Customization.strength());

                return espresso;

            case 2: // Latte

                Latte latte = new Latte();

                latte.setHasCaffeine(Customization.caffine());
                latte.setSize(Customization.size());
                latte.setStrength(Customization.strength());
                latte.setHasFoam(Customization.foam());
                latte.setMilk(Customization.milk());
                latte.setHeat(Customization.heat());
                latte.setSweetness(Customization.sweetness());

                return latte;


            case 3: // Americano

                Americano americano = new Americano();

                americano.setHasCaffeine(Customization.caffine());
                americano.setSize(Customization.size());
                americano.setStrength(Customization.strength());
                americano.setHeat(Customization.heat());

                return americano;

            case 4: // Mocha

                Mocha mocha = new Mocha();

                mocha.setHasCaffeine(Customization.caffine());
                mocha.setSize(Customization.size());
                mocha.setStrength(Customization.strength());
                mocha.setHasFoam(Customization.foam());
                mocha.setMilk(Customization.milk());
                mocha.setHeat(Customization.heat());
                mocha.setSweetness(Customization.sweetness());
                mocha.setChocolate(Customization.chocolate());

                return mocha;


            case 5: // Cappuccino

                Cappuccino cappuccino = new Cappuccino();

                cappuccino.setHasCaffeine(Customization.caffine());
                cappuccino.setSize(Customization.size());
                cappuccino.setStrength(Customization.strength());
                cappuccino.setHasFoam(Customization.foam());
                cappuccino.setMilk(Customization.milk());
                cappuccino.setSweetness(Customization.sweetness());

                return cappuccino;


            default:
                throw new IllegalArgumentException("Invalid Input, please read instructions and try again.");

        }
    }

    /**
     * Creates the order based on the input of the user, creates objects with the
     * customizations given by the user.
     * @param number takes in a number used as an identifier for the type of drink to create
     * @return returns a Tea based on the number input.
     * @throws IllegalArgumentException if number is not an expected number.
     */
    public static Tea makeTeaOrder(int number){

        Tea tea = new Tea();

        if (number == 1){
            tea.setType("Green");

            tea.setSize(Customization.size());
            tea.setHeat(Customization.heat());
            tea.setMilk(Customization.milk());
            tea.setSweetness(Customization.sweetness());
            tea.setHasLemon(Customization.lemon());

        } else if (number == 2) {
            tea.setType("Black");

            tea.setSize(Customization.size());
            tea.setHeat(Customization.heat());
            tea.setMilk(Customization.milk());
            tea.setSweetness(Customization.sweetness());
            tea.setHasLemon(Customization.lemon());

        } else {
            throw new IllegalArgumentException("Invalid Input, please read instructions and try again.");
        }

        return tea;
    }

}
