/**
 * @author Maximo Avalone
 * @version 1
 */
public class Cappuccino extends Coffee{


    private boolean hasFoam;
    private String milk;
    private double sweetness;


    /**
     * Constructor to create objects of the Cappuccino class
     * @param size tall or short
     * @param strength double or single
     * @param hasCaffeine true or false
     * @param hasFoam true or false
     * @param milk no fat almond whole soy half-and-half
     * @param sweetness 25 50 or 100 %
     */
    public Cappuccino(String size, String strength, boolean hasCaffeine,
                      boolean hasFoam, String milk, double sweetness){

        super(size, strength, hasCaffeine);
        this.hasFoam = hasFoam;
        this.milk = milk;
        this.sweetness = sweetness;
    }

    /**
     * Paramaterless constructor to create object of Cappuccino
     */
    public Cappuccino(){
        super();
        super.type = "Cappucino";
    }


    /**
     * get whether coffee has foam
     * @return true or false
     */
    public boolean getHasFoam(){
        return this.hasFoam;
    }

    /**
     * get the milk type
     * @return no fat almond whole soy half-and-half
     */
    public String getMilk(){
        return this.milk;
    }

    /**
     * get the sweetness of the coffee
     * @return 100, 25, 50 %
     */
    public double getSweetness(){
        return this.sweetness;
    }

    /**
     * Set whether coffee has foam or not
     * @param hasFoam true or false
     */
    public void setHasFoam(boolean hasFoam){
        this.hasFoam = hasFoam;
    }

    /**
     * set milk type of coffee
     * @param milk no fat almond whole soy half-and-half
     */
    public void setMilk(String milk){
        this.milk = milk;
    }

    /**
     * set the sweetness of the coffee
     * @param sweetness 100% 50% or 25%
     */
    public void setSweetness(double sweetness){
        this.sweetness = sweetness;
    }

    /**
     * Returns a string representation of cappuccino object
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
        String string2 = null;
        if (this.getHasFoam()){
            string2 = " Yes";
        } else {
            string2 = " no";
        }
        return "Strength: " + this.getStrength() + "\nSize: " + this.getSize() + "\n" +
                string + "\nFoam: " +  string2 + "\nMilk: " + this.milk + "\nSweetness: " +  this.sweetness;
    }


}
