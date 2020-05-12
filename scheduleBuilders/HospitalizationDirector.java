public class HospitalizationDirector implements Director {

    private ScheduleBuilder builder;
    
    public void setBuilder(ScheduleBuilder builder) {
        this.builder = builder;
    }

    public void constructPlan(ScheduleBuilder builder) {
        builder.setnOfTreatments(0);
    }
}