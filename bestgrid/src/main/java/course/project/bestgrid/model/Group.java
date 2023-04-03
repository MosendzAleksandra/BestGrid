package course.project.bestgrid.model;

import course.project.bestgrid.model.enumerate.WeekDay;

public class Group {
    private int groupID;
    private WeekDay weekend;

    private Flow flow;

    public Group() {
    }
    public int getGroupID() {
        return groupID;
    }
    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
    public WeekDay getWeekend() {
        return weekend;
    }
    public void setWeekend(WeekDay weekend) {
        this.weekend = weekend;
    }
    public Flow getFlow() {
        return flow;
    }
    public void setFlow(Flow flow) {
        this.flow = flow;
    }
}
