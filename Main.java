import java.util.Scanner;

import controller.ExaminationController;
import controller.UserController;
import view.PacientView;
import view.ExaminationView;

public class Main {

    private static Scanner sc; // = new Scanner(System.in);
    private static ExaminationController examinationController; // = new ExaminationController();
    private static UserController pacientController; // = new UserController(examinationController);
    private static PacientView acceptPacientView; // = new PacientView(sc, pacientController);
    private static ExaminationView examinationView; // = new ExaminationView(sc, examinationController);

    public static void init() {
        sc = new Scanner(System.in);
        examinationController = new ExaminationController(UserController.getInstance(examinationController));
        pacientController = UserController.getInstance(examinationController);
        acceptPacientView = new PacientView(sc, pacientController);
        examinationView = new ExaminationView(sc, examinationController);
    }

    public static void main(String[] args) {
        init();
        while (true) {
            int scenarioNumber;
            System.out.println("Zadaj cislo scenara: ");
            scenarioNumber = sc.nextInt();
            sc.nextLine();
            if (scenarioNumber == 0) {
                break;
            }
            switch (scenarioNumber) {
                case 1:
                    examinationView.examinePacient();
                    break;
                case 2:
                    acceptPacientView.transportPatient();
                    break;
                case 3:
                    acceptPacientView.acceptPatient();
                    break;
                case 4:
                    acceptPacientView.printPacientSchedule();
                    break;
                case 5:
                    acceptPacientView.setPacientExaminationPlan();
                    break;
                case 6:
                    acceptPacientView.setPacientHospitalizationPlan();
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}