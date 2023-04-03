package course.project.bestgrid.model;

import java.sql.Date;

public class Quarter {
    private int quarterID;
    private Date startDay;
    private Date endDay;
    
    public Quarter() {
    }
    public int getQuarterID() {
        return quarterID;
    }
    public void setQuarterID(int quarterID) {
        this.quarterID = quarterID;
    }
    public Date getStartDay() {
        return startDay;
    }
    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }
    public Date getEndDay() {
        return endDay;
    }
    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }
    
}
