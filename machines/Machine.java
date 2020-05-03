package machines;

import java.util.Scanner;

public abstract class Machine {

    protected MachineMediator machineMediator;

    public Machine(MachineMediator machineMediator) {
        this.machineMediator = machineMediator;
    }

    public void executeExamination() {
        /**
         * zistim ci je pacient v pohode, to bude ze mediatorom sa spytam
         * nastavenie najekych parametrov
         * potvrdenie personalom
         * vykonanie vysetrenia
         * vypis vysledky a vytvorenie nejakeho objektu
         */
        checkPacientState();
        setExaminationVariables();
        confirmByPersonel();
        exexute(); // tu by sa mozno dal pouzit command
        endExamination();
    }

    public void checkPacientState() {

    }

    public abstract void setExaminationVariables();

    public boolean confirmByPersonel() {
        System.out.println("Potvrdte zaciatok vysetrenia.");
        Scanner sc = new Scanner(System.in);
        int examinePacient  = sc.nextInt();
        sc.close();
        return examinePacient == 1 ? true : false;
    }

    public abstract void exexute();

    public void endExamination() {
        System.out.println("Vysetrenie ukoncene");
    }
    
}