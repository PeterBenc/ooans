package scheduleBuilders;

import controller.UserController;
import schedule.Schedule;

public class HospitalizationScheduleBuilder implements ScheduleBuilder {

    private UserController userController;

    public HospitalizationScheduleBuilder(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void buildExaminations() {
        // TODO Auto-generated method stub

    }

    @Override
    public void buildTranfers() {
        // TODO Auto-generated method stub

    }

    @Override
    public void buildTreatments() {
        // TODO Auto-generated method stub

    }

    @Override
    public Schedule getSchedule() {
        // TODO Auto-generated method stub
        return null;
    }
    
}