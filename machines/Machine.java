package machines;

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

    public void executeExamination() {
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
        exexute(); // tu by sa mozno dal pouzit command
        endExamination();
    }

    public void checkPacientState() {
        this.machineMediator.checkEkgState();
    }

    public abstract void setExaminationVariables();

    public boolean confirmByPersonel() {
        System.out.println("Potvrdte zaciatok vysetrenia.");
        Scanner sc = new Scanner(System.in);
        int examinePacient  = sc.nextInt();
        sc.nextLine();
        sc.close();
        return examinePacient == 1 ? true : false;
    }

    public abstract void exexute();

    public void endExamination() {
        System.out.println("Vysetrenie ukoncene");
    }
    
}