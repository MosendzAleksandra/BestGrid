package course.project.bestgrid.model;

public class Subject {
    private int subjectID ;
    private String name;
    private int hours;
    private int classType;
    
    public Subject() {
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getClassType() {
        return classType;
    }
    public void setClassType(int classType) {
        this.classType = classType;
    }
    public int getSubjectID() {
        return subjectID;
    }
    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
