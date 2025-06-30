
/**
 * The class responsable for the creation of tea objects.
 *
 * @author Maximo Avalone
 * @version 1
 *
 */

public class Tea {

    private String type;
    private String size;
    private String heat;
    private String milk;
    private double sweetness;
    private boolean hasLemon;


    /**
     * A constructor for the creation of the Tea object.
     * @param type black or green
     * @param size short long
     * @param heat extra hot iced or normal
     * @param milk whole half and half no fat almond soy
     * @param sweetness 100% 50% 25%
     * @param hasLemon true false
     */
    public Tea(String type, String size, String heat, String milk, double sweetness,
               boolean hasLemon){

        this.type = type;
        this.size = size;
        this.heat = heat;
        this.milk = milk;
        this.sweetness = sweetness;
        this.hasLemon = hasLemon;

    }

    /**
     * Parameterless constructor for the creation of objects in the Tea class.
     */
    public Tea(){

    }

    /**
     * gets the type of tea
     * @return black or green
     */
    public String getType(){
        return this.type;
    }

    /**
     * gets the size of the tea
     * @return short long
     */
    public String getSize(){
        return this.size;
    }

    /**
     * gets the heat
     * @return extra hot iced normal
     */
    public String getHeat(){
        return this.heat;
    }

    /**
     * gets the milk
     * @return no fat whole half and half almond soy
     */
    public String getMilk(){
        return this.milk;
    }

    /**
     * gets the sweetness of the tea
     * @return 100% 50% 25%
     */
    public double getSweetness(){
        return this.sweetness;
    }

    /**
     * gets whether the tea has lemon or not
     * @return true false
     */
    public boolean getHasLemon(){
        return this.hasLemon;
    }


    /**
     * sets the type of tea
     * @param type green black
     */

    public void setType(String type) {
        if (type.equalsIgnoreCase("black") || type.equalsIgnoreCase("green")) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Tea can only have a type of Black or Green");
        }
    }

    /**
     * sets the size of tea
     * @param size long short
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * gets the heat of tea
     * @param heat extra hot normal iced
     */
    public void setHeat(String heat) {
        this.heat = heat;
    }

    /**
     * sets the milk
     * @param milk no fat whole half and half soy almond
     */
    public void setMilk(String milk) {
        this.milk = milk;
    }

    /**
     * sets the sweetness
     * @param sweetness 100% 50% 25%
     */
    public void setSweetness(double sweetness) {
        this.sweetness = sweetness;
    }

    /**
     * sets the value for hasLemon
     * @param hasLemon true or false
     */
    public void setHasLemon(boolean hasLemon) {
        this.hasLemon = hasLemon;
    }

    /**
     * Creates a string representation of and object of the tea class
     * @return string that represents the attributes of an object of the tea class
     */
    public String toString(){
        String string = null;
        if (!this.hasLemon){
            string = "Yes";
        } else{
            string = "No";
        }
        return "Size: " + this.size + "\nLemon: " +  string + "\nHeat: " + this.heat +  "\nMilk: " +
                this.milk + "\nSweetness: " +  this.sweetness;
    }
}


