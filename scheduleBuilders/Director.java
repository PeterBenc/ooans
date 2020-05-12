package scheduleBuilders;

import users.Doctor;
import users.Pacient;

public interface Director {

    private ScheduleBuilder builder;

    public void setBuilder(ScheduleBuilder builder);

    public void constructPlan(ScheduleBuilder builder);
    
}