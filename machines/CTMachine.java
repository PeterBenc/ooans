package machines;

public class CTMachine extends Machine {

    public CTMachine(MachineMediator machineMediator) {
        super(machineMediator);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void setExaminationVariables() {
        System.out.println("Setting variables on CT machine");

    }

    @Override
    public void exexute() {
        System.out.println("Executing examination on CT machine");

    }
    
}