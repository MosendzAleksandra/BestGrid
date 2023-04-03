package course.project.bestgrid.model;

import course.project.bestgrid.model.enumerate.ClassType;

public class Classroom {
    private int classroomNumber;
    private Building building;
    private int capacity; 
    private ClassType type;
    
    public Classroom() {
    }
    public int getClassroomNumber() {
        return classroomNumber;
    }
    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }
    public Building getBuilding() {
        return building;
    }
    public void setBuilding(Building building) {
        this.building = building;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public ClassType getType() {
        return type;
    }
    public void setType(ClassType type) {
        this.type = type;
    }
}