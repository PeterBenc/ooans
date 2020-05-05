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

    public void executeExamination(Examination examination) {
        // template method
        /**
         * zistim ci je pacient v pohode, to bude ze mediatorom sa spytam
         * nastavenie najekych parametrov
         * potvrdenie personalom
         * vykonanie vysetrenia
         * vypis vysledky a vytvorenie nejakeho objektu
         */
        checkPacientState();
        if(this.pacientStateOK == false) {
            return;
        }
        setExaminationVariables();
        confirmByPersonel();
        exexute();
        endExamination(examination);
    }

    private void checkPacientState() {
        this.machineMediator.checkEkgState();
    }

    public abstract void setExaminationVariables();

    private boolean confirmByPersonel() {
        System.out.println("Potvrdte zaciatok vysetrenia.");
        Scanner sc = new Scanner(System.in);
        int examinePacient = sc.nextInt();
        sc.nextLine();
        sc.close();
        return examinePacient == 1 ? true : false;
    }

    public abstract void exexute();

    private void endExamination(Examination examination) {
        System.out.println("Vysetrenie ukoncene");
        examination.setDone(true);
    }

}