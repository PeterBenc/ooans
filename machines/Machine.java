package machines;
import events.Examination;

import java.util.Scanner;
public abstract class Machine {
    protected MachineMediator machineMediator;
    private boolean pacientStateOK = false;
    public Machine(MachineMediator machineMediator) {
        this.machineMediator = machineMediator;
    }

    public void setPacientStateOk(Boolean pacientStateOk) {
        this.pacientStateOK = pacientStateOK;
    }
    public void executeExamination(Examination examination) {  // template method
        checkPacientState();
        if(this.pacientStateOK == false) {
            return;
        }
        setExaminationVariables();
        confirmByPersonel();
        execute();
        endExamination(examination);
    }
    private void checkPacientState() {
        this.machineMediator.checkEkgState();
    }
    protected abstract void setExaminationVariables();
    private boolean confirmByPersonel() {
        System.out.println("Potvrdte zaciatok vysetrenia.");
        Scanner sc = new Scanner(System.in);
        int examinePacient = sc.nextInt();
        sc.nextLine();
        sc.close();
        return examinePacient == 1 ? true : false;
    }
    protected abstract void execute();
    private void endExamination(Examination examination) {
        System.out.println("Vysetrenie ukoncene");
        examination.setDone(true);
    }

}