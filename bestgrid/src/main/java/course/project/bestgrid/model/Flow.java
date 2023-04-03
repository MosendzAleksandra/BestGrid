package course.project.bestgrid.model;

public class Flow {
    private int flowID;
    private int countgroups;
    private int courseNumber;
    private String faculty ;
    private String specialization;
    
    public Flow() {
    }
    public int getFlowID() {
        return flowID;
    }
    public void setFlowID(int flowID) {
        this.flowID = flowID;
    }
    public int getCountgroups() {
        return countgroups;
    }
    public void setCountgroups(int countgroups) {
        this.countgroups = countgroups;
    }
    public int getCourseNumber() {
        return courseNumber;
    }
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
