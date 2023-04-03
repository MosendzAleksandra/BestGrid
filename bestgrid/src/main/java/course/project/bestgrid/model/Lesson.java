package course.project.bestgrid.model;

import course.project.bestgrid.model.enumerate.LessonType;
import course.project.bestgrid.model.enumerate.WeekDay;

public class Lesson {
    private int lessonID;
    private WeekDay weekday;
    private String week;
    private String time;
    private LessonType type;

    private Classroom classroom ;
    private Building building;  // Опираясь на данные classroom или наоборот

    private Group group; // или группа или поток
    private Flow flow; 

    private Subject subject;
    private Employee teacher;
    
    public Lesson() {
    }
    public int getLessonID() {
        return lessonID;
    }
    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }
    public WeekDay getWeekday() {
        return weekday;
    }
    public void setWeekday(WeekDay weekday) {
        this.weekday = weekday;
    }
    public String getWeek() {
        return week;
    }
    public void setWeek(String week) {
        this.week = week;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public LessonType getType() {
        return type;
    }
    public void setType(LessonType type) {
        this.type = type;
    }
    public Classroom getClassroom() {
        return classroom;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    public Building getBuilding() {
        return building;
    }
    public void setBuilding(Building building) {
        this.building = building;
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
    public Subject getSubject() {
        return subject;
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public Employee getTeacher() {
        return teacher;
    }
    public void setTeacher(Employee teacher) {
        this.teacher = teacher;
    }

}
