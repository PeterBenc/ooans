package scheduleBuilders;

import users.Doctor;
import users.Pacient;

public class Director {

    private ScheduleBuilder builder;

    public void setBuilder(ScheduleBuilder builder) {
        this.builder = builder;
    }

    public void constructExaminationPlan(ScheduleBuilder builder) {
        builder.setnOfTreatments(0);
    }

    public void constructHospitalizationPlan(ScheduleBuilder builder) {
        builder.setnOfTreatments(1);
    }
    
}