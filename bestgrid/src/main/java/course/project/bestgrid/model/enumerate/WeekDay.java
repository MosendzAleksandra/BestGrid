package course.project.bestgrid.model.enumerate;

public enum WeekDay {
    MONDADAY("monday"),
    TUESDAY("tuesday"), 
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    private String day;

    WeekDay(String day){
        this.day = day;
    }
    public String getDay(){ return day;}

}
