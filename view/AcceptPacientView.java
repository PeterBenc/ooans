package view;

import java.util.Scanner;
import controller.*;

public class AcceptPacientView {
    protected Scanner sc;
    private PacientController pacientController;
    // protected ExaminationController examinationController;

    public AcceptPacientView(Scanner sc, PacientController pacientController) {
        this.sc = sc;
        this.pacientController = pacientController;
    }

    public void acceptPatient() {
        System.out.println("Zadaj meno pacienta:");
        String pacientName = sc.nextLine();
        pacientController.addPacient(pacientName);
        System.out.println("Pacient bol pridany do systemu. \nChcete vytvorit pacientovi plan vysetrenia");
        int createExaminationPlan = sc.nextInt();
        // tu sa zavola funkcia z controllera ktora bud vytvori null object alebo vysetrenie
        // potom bude dalsi scenar ze ceknut nieco o pacientovi a ked tak to vrati null object
    }
}