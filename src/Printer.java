/**
 * Class responsable for printing menu and reciept.
 *
 * @author Maximo Avalone
 * @version 1
 */

public class Printer {


    /**
     * prints the menu of options for the user.
     */
    public static void printMenu(){
        System.out.print("Please enter the corresponding catagory (Coffee or Tea)");
        System.out.println(" and number for the choice you would like to order");

        System.out.println("Coffee:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Americano");
        System.out.println("4. Mocha");
        System.out.println("5. Cappuccino\n");

        System.out.println("Tea:");
        System.out.println("1. Green");
        System.out.println("2. Black\n");

    }

    /**
     * prints the receipt for the user.
     * @param coffees an array of coffees
     * @param teas an array of teas
     */
    public static void printReceipt(Coffee[] coffees, Tea[] teas){
        for (int i = 0; i < coffees.length; i++) {
            if (teas[i] == null && coffees[i] != null) {
                System.out.println("\nDrink " + (i+1) + ":");
                System.out.println(coffees[i].type);
                System.out.println(coffees[i].toString());
            } else if (coffees[i] == null && teas[i] != null){
                System.out.println("\nDrink " + (i+1) + ":");
                System.out.println(teas[i].getType());
                System.out.println(teas[i].toString());
            } else {
                break;
            }


        }
    }
}
