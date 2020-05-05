package scheduleBuilders;

import java.util.ArrayList;

import events.*;
import schedule.Schedule;
import users.Doctor;
import users.Pacient;

public interface ScheduleBuilder {

    public ArrayList<Examination> buildExaminations(Pacient pacient);

    public ArrayList<Transfer> buildTranfers(Pacient pacient, Doctor doctor);

    public ArrayList<Treatment> buildTreatments(Pacient pacient);

    public Schedule getSchedule(Pacient pacient, Doctor doctor);

    public void setnOfTreatments(int nOfTreatments);
    
}