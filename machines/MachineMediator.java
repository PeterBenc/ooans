package machines;

public class MachineMediator {

    public EKGMachine ekgMachine;
    public Machine machine;
    
    public MachineMediator() {}

    public void setEkgMachine(EKGMachine ekgMachine) {
        this.ekgMachine = ekgMachine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public void checkEkgState() {
        this.ekgMachine.isExaminationSafe();
    }

    public void permitExamination() {
        this.machine.setPacientStateOk(true);
    }
}