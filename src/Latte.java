/**
 * @author Maximo Avalone
 * @version 1
 */

public class Latte extends Coffee{

    private boolean hasFoam;
    private String heat;
    private String milk;
    private double sweetness;


    /**
     * constructor to create latte object
     * @param size tall short
     * @param strength double single
     * @param hasCaffeine true false
     * @param hasFoam true false
     * @param heat extra hot normal iced
     * @param milk no fat almond soy whole half and half
     * @param sweetness 100% 50% 25%
     */
    public Latte(String size, String strength, boolean hasCaffeine,
                 boolean hasFoam, String heat, String milk, double sweetness){

        super(size, strength, hasCaffeine);
        this.hasFoam = hasFoam;
        this.heat = heat;
        this.milk = milk;
        this.sweetness = sweetness;
    }

    /**
     * paramaterless constructor for making a default latte
     */
    public Latte(){
        super();
        super.type = "Latte";
    }

    /**
     * gets whether there is foam or not
     * @return true false
     */
    public boolean getHasFoam(){
        return this.hasFoam;
    }

    /**
     * gets heat of coffee
     * @return extera hot normal iced
     */
    public String getHeat(){
        return this.heat;
    }

    /**
     * gets the milk value of the latte
     * @return no fat half and half soy almond whole
     */
    public String getMilk(){
        return this.milk;
    }

    /**
     * gets the sweetness value of the latte
     * @return 100 50 25 %
     */
    public double getSweetness(){
        return this.sweetness;
    }

    /**
     * sets whether foam or not
     * @param hasFoam true false
     */
    public void setHasFoam(boolean hasFoam){
        this.hasFoam = hasFoam;
    }
    public void setHeat(String heat){
        this.heat = heat;
    }
    public void setMilk(String milk){
        this.milk = milk;
    }
    public void setSweetness(double sweetness){
        this.sweetness = sweetness;
    }

    /**
     * creates a string representation of the object
     * @return string representation of object of latte
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
                this.milk + "\nSweetness: " +  this.sweetness;
    }
}
