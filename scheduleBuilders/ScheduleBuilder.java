package scheduleBuilders;
import schedule.Schedule;

public interface ScheduleBuilder {

    public void buildExaminations();

    public void buildTranfers();

    public void buildTreatments();

    public Schedule getSchedule();
    
}