package machines;

public class EKGMachine {

    private MachineMediator machineMediator;

    public EKGMachine(MachineMediator machineMediator) {
        this.machineMediator = machineMediator;
    }

    public boolean isExaminationSafe() {
        this.machineMediator.permitExamination();
        return true;
    }

}