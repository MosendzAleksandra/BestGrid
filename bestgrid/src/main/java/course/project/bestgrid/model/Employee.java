package course.project.bestgrid.model;

public class Employee {
    private int employeeID;
    private String post;
    private String department ;
    private String email  ;
    private String phone  ;
    private String office  ;
    private String workSchedule  ;
    private int isTeacher ;
    
    public Employee() {
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
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public String getWorkSchedule() {
        return workSchedule;
    }
    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }
    public int getIsTeacher() {
        return isTeacher;
    }
    public void setIsTeacher(int isTeacher) {
        this.isTeacher = isTeacher;
    }
}
