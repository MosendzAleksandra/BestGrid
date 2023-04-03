package course.project.bestgrid.model;

public class Subject {
    private int subjectID ;
    private String name;
    private int lectureTime ;
    private int pzTime ;
    private int lrTime;
    
    public Subject() {
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
    public int getLectureTime() {
        return lectureTime;
    }
    public void setLectureTime(int lectureTime) {
        this.lectureTime = lectureTime;
    }
    public int getPzTime() {
        return pzTime;
    }
    public void setPzTime(int pzTime) {
        this.pzTime = pzTime;
    }
    public int getLrTime() {
        return lrTime;
    }
    public void setLrTime(int lrTime) {
        this.lrTime = lrTime;
    }
}
