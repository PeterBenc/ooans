package scheduleBuilders;

import java.util.ArrayList;

import controller.UserController;
import events.*;
import schedule.Schedule;

public class ExaminationScheduleBuilder implements ScheduleBuilder {

    private UserController userController;

    public ExaminationScheduleBuilder(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void buildExaminations() {
        // toto musi vytvorit a vratit nejaky arraylist examinations
        // TODO Auto-generated method stub

    }

    @Override
    public void buildTranfers() {

    }

    @Override
    public void buildTreatments() {
        // return prazdny list treatmentov

    }

    @Override
    public Schedule getSchedule() {
        
        return null;
    }
    
}