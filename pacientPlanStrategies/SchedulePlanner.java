package pacientPlanStrategies;

import schedule.Schedule;
import users.Doctor;
import users.Pacient;

public interface SchedulePlanner {

    public Schedule createEvents(Pacient pacient, Doctor doctor);
    
}