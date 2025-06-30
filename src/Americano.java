/**
 * @author Maximo Avalone
 * @version 1
 */

public class Americano extends Coffee {


    private String heat; // iced normal extra hot

    /**
     * Constructor to create objects of the Americano class
     * @param size tall or short
     * @param strength double or single
     * @param hasCaffeine true or false
     * @param heat extra hot normal or iced
     */
    public Americano(String size, String strength, boolean hasCaffeine, String heat) {
        super(size, strength, hasCaffeine);
        this.heat = heat;
    }

    /**
     * Paramaterless constructor to create objects of Americano class.
     */
    public Americano(){
        super();
        super.type = "Americano";
    }


    /**
     * get the heat of a coffee
     * @return normal, extra hot or iced
     */
    public String getHeat(){
        return this.heat;
    }

    /**
     * sets the heat of the coffee
     * @param heat extra hot, normal or iced
     */
    public void setHeat(String heat){
        this.heat = heat;
    }

    /**
     * Returns a string representation of coffee object
     * @return string
     */
    @Override
   public String toString(){
        String string = null;
        if (!this.getHasCaffeine()){
            string = "Decaf";
        } else {
            string = "Caffinated";
        }
        return "Strength: " + this.getStrength() + "\nSize: " + this.getSize() + "\n" +
                string + "\nHeat: " + this.heat;
   }

}