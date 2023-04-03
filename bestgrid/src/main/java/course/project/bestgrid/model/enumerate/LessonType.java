package course.project.bestgrid.model.enumerate;

public enum LessonType {
    LECTURE("lecture"),
    PZ("pz"), 
    LR("lr"),
    GYM("gym"),
    FACULTATIVE("facultative");

    private String type;

    LessonType(String type){
        this.type = type;
    }
    public String getType(){ return type;}
}
