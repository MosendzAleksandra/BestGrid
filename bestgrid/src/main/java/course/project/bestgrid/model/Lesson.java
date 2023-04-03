package course.project.bestgrid.model;

import java.sql.Time;

import course.project.bestgrid.model.enumerate.WeekDay;

public class Lesson {
    private int lessonID;
    private WeekDay weekday;
    private Time time;
    private Classroom classroom ;
    
    private Group group; // или группа или поток
    private Flow flow; 

    private Subject subject;
    private Employee teacher;
    
    public Lesson() {
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
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
    
    public Classroom getClassroom() {
        return classroom;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
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
