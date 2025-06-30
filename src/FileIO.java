import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Class responsable for reading and writing to file that accompanies program storing the number of orders
 * the shop has taken in its lifetime.
 *
 * @author Maximo Avalone
 * @version 1
 */
public class FileIO {

    /**
     * updates the value that is in the file to a new value based on how many new orders
     * were taken
     * @param updatedVal int how much to update the current value by
     */
    public static void updateOrderNum(int updatedVal){
        int current;
        try {
            current = readOrderNum();
        } catch (NoSuchElementException e) {
            current = 0;
        }


        File file = new File("NumberOfOrders.txt");
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileOutputStream(file));

            current += updatedVal;

            pw.print(current);


        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }


    }

    /**
     * reads the current number of orders from the file and returns it
     * @return int, current number of orders
     */
    public static int readOrderNum(){

        File file = new File("NumberOfOrders.txt");
        Scanner scan = null;
        int num;
        try {
           scan  = new Scanner(new FileInputStream(file));
           try {
               num = scan.nextInt();
           } catch (NoSuchElementException e){
               return 0;
           }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            scan.close();
        }

        return num;
    }


}
