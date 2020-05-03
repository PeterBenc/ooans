package pacientPlanStrategies;

import schedule.Schedule;
import users.Pacient;

public interface SchedulePlanner {

    public Schedule createEvents(Pacient pacient);
    
}