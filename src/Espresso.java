/**
 * @author Maximo Avalone
 * @version 1
 */

public class Espresso extends Coffee{


    /**
     * constuctor to create object of espresso class
     * @param size tall short
     * @param strength double single
     * @param hasCaffeine true false
     */
    public Espresso(String size, String strength, boolean hasCaffeine){
        super(size, strength, hasCaffeine);
    }

    public Espresso(){
        super();
        super.type = "Espresso";
    }

    /**
     * Returns a string version of an object of espresso class
     * @return string with value of espresso class attributes
     */
    @Override
    public String toString(){
        String string = null;
        if (!this.getHasCaffeine()) {
            string = "Decaf";
        } else {
            string = "Caffinated";
        }
        return "Strength: " + this.getStrength() + "\nSize: " + this.getSize() + "\n" +
                string;
    }

}
