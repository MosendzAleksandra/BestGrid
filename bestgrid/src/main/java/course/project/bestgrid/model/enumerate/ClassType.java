package course.project.bestgrid.model.enumerate;

public enum ClassType {
    STANDART("standart"),
    LECTURE("lecture"), 
    COMPUTER("computer");

    private String type;

    ClassType(String type){
        this.type = type;
    }
    public String getType(){ return type;}
}
