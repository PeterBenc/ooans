package view;

import java.util.Scanner;
import controller.*;

public class AcceptPacientView {
    protected Scanner sc;
    private UserController pacientController;
    // protected ExaminationController examinationController;

    public AcceptPacientView(Scanner sc, UserController pacientController) {
        this.sc = sc;
        this.pacientController = pacientController;
    }

    public void acceptPatient() {
        System.out.println("Zadaj meno pacienta:");
        String pacientName = sc.nextLine();
        System.out.println("Chcete vytvorit pacientovi plan vysetrenia, 0/1");
        int createExaminationPlan = sc.nextInt();
        pacientController.addPacient(pacientName, createExaminationPlan);
    }
}