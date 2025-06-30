/**
 * @author Maximo Avalone
 * @version 1
 */

public class Mocha extends Coffee{

    private boolean hasFoam;
    private String heat;
    private String milk;
    private String chocolate;
    private double sweetness;

    /**
     * constructor for creating an object of the mocha class
     * @param size tall short
     * @param strength double single
     * @param hasCaffeine true false
     * @param hasFoam true false
     * @param heat extra hot normal iced
     * @param milk no fat half and half whole soy almond
     * @param chocolate full half
     * @param sweetness 100 50 25%
     */
    public Mocha(String size, String strength, boolean hasCaffeine,
                 boolean hasFoam, String heat, String milk, String chocolate, double sweetness){

        super(size, strength, hasCaffeine);
        this.hasFoam = hasFoam;
        this.heat = heat;
        this.milk = milk;
        this.chocolate = chocolate;
        this.sweetness = sweetness;
    }

    /**
     * parameterless constructor for mocha class.
     */
    public Mocha(){
        super();
        super.type = "Mocha";
    }


    /**
     * gets the foam value
     * @return true or false
     */
    public boolean getHasFoam(){
        return this.hasFoam;
    }

    /**
     * gets the heat value for mocha objects
     * @return extra hot normal iced
     */
    public String getHeat(){
        return this.heat;
    }

    /**
     * returns the milk value for mocha objects
     * @return no fat half and half whole almond soy
     */
    public String getMilk(){
        return this.milk;
    }

    /**
     * retursn the chocolate value for mocha objects
     * @return full half
     */
    public String getChocolate(){
        return this.chocolate;
    }

    /**
     * returns the sweetness value of the mocha object
     * @return 100% 50% 25 %
     */
    public double getSweetness(){
        return this.sweetness;
    }

    /**
     * sets the value for whether foam or not
     * @param hasFoam true false
     */
    public void setHasFoam(boolean hasFoam){
        this.hasFoam = hasFoam;
    }

    /**
     * sets the heat value
     * @param heat normal extra hot iced
     */
    public void setHeat(String heat){
        this.heat = heat;
    }

    /**
     * sets the milk value
     * @param milk whole half and half almond soy no fat
     */
    public void setMilk(String milk){
        this.milk = milk;
    }

    /**
     * sets the chocolate value
     * @param chocolate full half
     */
    public void setChocolate(String chocolate){
        this.chocolate = chocolate;
    }

    /**
     * sets the sweetness value
     * @param sweetness 100% 50% 25%
     */
    public void setSweetness(double sweetness){
        this.sweetness = sweetness;
    }

    /**
     * creates a string representation of objects of mocha class
     * @return String for values of the attributes of the mocha class
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
                string + "\nFoam: " +  string2 + "\nHeat: " + this.heat +  "\nMilk: " +
                this.milk + "\nSweetness: " +  this.sweetness + "\nChocolate: " + this.chocolate;
    }


}
