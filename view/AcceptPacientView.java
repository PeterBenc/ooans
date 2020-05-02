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
        System.out.println("Zadaj vaznost stavu pacienta.");
        int severity = sc.nextInt();
        pacientController.addPacient(pacientName, severity);
    }
}