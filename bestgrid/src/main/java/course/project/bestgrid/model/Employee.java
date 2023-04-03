package course.project.bestgrid.model;

import course.project.bestgrid.model.enumerate.WeekDay;

public class Employee {
    private int employeeID;
    private String post;
    private WeekDay metodDay;
    private int isTeacher ;
    
    public Employee() {
    }
    public WeekDay getMetodDay() {
        return metodDay;
    }
    public void setMetodDay(WeekDay metodDay) {
        this.metodDay = metodDay;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    
    public int getIsTeacher() {
        return isTeacher;
    }
    public void setIsTeacher(int isTeacher) {
        this.isTeacher = isTeacher;
    }
}
