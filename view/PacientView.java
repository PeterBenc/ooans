package view;

import java.util.Scanner;

import controller.*;
import events.Examination;
import schedule.ExaminationIterator;
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
        Schedule schedule = this.userController.getPacient(name).getSchedule();
        ExaminationIterator examinationIterator = (ExaminationIterator) schedule.createIterator();

        //schedule.getEvents();


        // pridame trvanie a cas tych eventov
        // mozeme pouzit iteratora a vypisat napr sumu trvania


        while (true) {
            int scenarioNumber;
            System.out.println("Zadaj cislo  vypis scenara: ");
            scenarioNumber = sc.nextInt();
            sc.nextLine();
            if (scenarioNumber == 0) {
                break;
            }
            switch (scenarioNumber) {
                case 1:
                    System.out.println("Not completed examinations:");
                    int sumDuration = 0;
                    while (examinationIterator.hasNext()) {
                        Examination examination = (Examination) examinationIterator.next();
                        if (examination != null) {

                            System.out.print(examination + " , ");
                            sumDuration += examination.getDuration();
                        }
                    }
                    System.out.println();
                    System.out.println(" Predpokladane celkove trvanie vsetkych nevykopnanych vysetreni " + sumDuration);
                    break;
                case 2:

                    break;

                default:
                    break;
            }
        }

    }

    public void transportPatient() {
        System.out.println("Zadaj meno pacienta");
        String name = sc.nextLine();
        userController.transportPacient(name);
    }
}