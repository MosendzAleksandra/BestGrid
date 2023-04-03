package course.project.bestgrid.model;

public class Factor{
    private int factorID ;
    private String name;
    private String value;
    private float weight;
    public Factor() {
    }
    public int getFactorID() {
        return factorID;
    }
    public void setFactorID(int factorID) {
        this.factorID = factorID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
   
}