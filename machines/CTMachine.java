package machines;

public class CTMachine extends Machine {

    public CTMachine(MachineMediator machineMediator) {
        super(machineMediator);
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void setExaminationVariables() {
        System.out.println("Setting variables on CT machine");

    }
    @Override
    protected void execute() {
        System.out.println("Executing examination on CT machine");

    }

}

