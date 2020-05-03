package scheduleBuilders;

import java.util.ArrayList;

import events.*;
import schedule.Schedule;
import users.Pacient;

public interface ScheduleBuilder {

    public ArrayList<Examination> buildExaminations(Pacient pacient);

    public ArrayList<Transfer> buildTranfers(Pacient pacient);

    public ArrayList<Treatment> buildTreatments(Pacient pacient);

    public Schedule getSchedule(Pacient pacient);
    
}