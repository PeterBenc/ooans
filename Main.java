import java.util.Scanner;

import controller.ExaminationController;
import controller.UserController;
import view.PacientView;
import view.ExaminationView;

public class Main {

    private static Scanner sc;
    private static ExaminationController examinationController;
    private static UserController pacientController;
    private static PacientView acceptPacientView;
    private static ExaminationView examinationView;

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