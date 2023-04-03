package course.project.bestgrid.model;

public class Student {
    private int studentID;
    private Group group;
    private Flow flow;  // Опираясь на данные group или наоборот

    public Student() {
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
    public Flow getFlow() {
        return flow;
    }
    public void setFlow(Flow flow) {
        this.flow = flow;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
