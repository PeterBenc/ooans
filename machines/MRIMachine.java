package machines;

public class MRIMachine extends Machine {

    public MRIMachine(MachineMediator machineMediator) {
        super(machineMediator);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void setExaminationVariables() {
        System.out.println("Setting variables on MRI machine");

    }

    @Override
    public void exexute() {
        System.out.println("Executing examination on MRI machine");

    }

}