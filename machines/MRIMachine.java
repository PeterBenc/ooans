package machines;

public class MRIMachine extends Machine {

    public MRIMachine(MachineMediator machineMediator) {
        super(machineMediator);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void setExaminationVariables() {
        System.out.println("Setting variables on MRI machine");

    }

    @Override
    protected void execute() {
        System.out.println("Executing examination on MRI machine");

    }

}