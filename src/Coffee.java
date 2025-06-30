
/**
 * Class for the creation of the Coffee Object
 *
 * @author Maximo Avalone
 *
 * @version 1
 */

public class Coffee {

    private String size;
    private String strength;
    private boolean hasCaffeine;

    public String type;

    //public int attributeCount = 3;

    /**
     * Constructor to create a Coffee object with specified attributes.
     *
     * @param size The size of the coffee (Tall/Short)
     * @param strength The strength of the coffee (Single/Double
     * @param hasCaffeine True if the coffee contains caffeine false if it's decaf
     */
    public Coffee(String size, String strength, boolean hasCaffeine){
       this.size = size;
       this.strength = strength;
       this.hasCaffeine = hasCaffeine;
    }

    /**
     * Parameterless constructor to create an empty Coffee object.
     */
    public Coffee(){

    }

    /**
     * Gets the size of the coffee.
     *
     * @return The size of the coffee.
     */
    String getSize(){
        return this.size;
    }
    /**
     * Gets whether the coffee has caffeine.
     *
     * @return True if it has caffeine, false otherwise.
     */
    boolean getHasCaffeine(){
        return this.hasCaffeine;
    }

    /**
     * Gets the strength of the coffee.
     *
     * @return The strength of the coffee.
     */
    String getStrength(){
        return this.strength;
    }


    /**
     * Sets the strength of the coffee.
     * @param strength single or double
     */
    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * sets whether the coffee has caffeine or not
     * @param hasCaffeine true or false
     */
    public void setHasCaffeine(boolean hasCaffeine) {
        this.hasCaffeine = hasCaffeine;
    }

    /**
     * sets size of the coffee
     * @param size tall or short
     */
    public void setSize(String size) {
        this.size = size;
    }


    /**
     * Checks if two coffee objects are equal
     *
     * @param obj The object to compare
     * @return true or false
     */
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Returns a string representation of the Coffee object.
     *
     * @return A string describing the coffee.
     */
    public String toString(){
        String string = null;
        if (!this.hasCaffeine){
            string = "Decaf";
        }
        return "Strength: " + this.strength + "\nSize:" + this.size + "\n" + string;
    }
}




