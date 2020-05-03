package view;

import java.util.Scanner;
import controller.*;
import schedule.Schedule;

public class PacientView {
    protected Scanner sc;
    private UserController pacientController;
    // protected ExaminationController examinationController;

    public PacientView(Scanner sc, UserController pacientController) {
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

    public void printPacientSchedule() {
        System.out.println("Zadaj meno pacienta");
        String name = sc.nextLine();
        Schedule schedule =  this.pacientController.getPacient(name).getSchedule();
        // tu by mohol byt iterator na vypisanie tych eventov co sa maju stat
    }
}