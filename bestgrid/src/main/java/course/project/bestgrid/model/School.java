package course.project.bestgrid.model;

public class School {
    private int schoolID;
    private Address address;
    private String phone;
    
    public School() {
    }
    public int getSchoolID() {
        return schoolID;
    }
    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
