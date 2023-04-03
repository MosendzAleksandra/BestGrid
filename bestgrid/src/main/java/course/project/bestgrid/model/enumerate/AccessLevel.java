package course.project.bestgrid.model.enumerate;

public enum AccessLevel {
    ALL(1),
    CONFIGURE(2),
    VIEW(3);

    private int code;

    AccessLevel(int code){
        this.code = code;
    }
    public int getCode(){ return code;}
}
