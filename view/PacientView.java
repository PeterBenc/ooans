package view;

import java.util.Scanner;
import controller.*;
import schedule.Schedule;

public class PacientView {
    protected Scanner sc;
    private UserController userController;
    // protected ExaminationController examinationController;

    public PacientView(Scanner sc, UserController userController) {
        this.sc = sc;
        this.userController = userController;
    }

    public void acceptPatient() {
        System.out.println("Zadaj meno pacienta:");
        String pacientName = sc.nextLine();
        System.out.println("Chcete vytvorit pacientovi plan vysetrenia, 0/1");
        int createExaminationPlan = sc.nextInt();
        sc.nextLine();
        userController.addPacient(pacientName, createExaminationPlan);
    }

    public void printPacientSchedule() {
        System.out.println("Zadaj meno pacienta");
        String name = sc.nextLine();
        Schedule schedule =  this.userController.getPacient(name).getSchedule();
        schedule.getEvents();
        // pridame trvanie a cas tych eventov
        // mozeme pouzit iteratora a vypisat napr sumu trvania
        // 
        // tu by mohol byt iterator na vypisanie tych eventov co sa maju stat
    }
}