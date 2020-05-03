import java.util.Scanner;

import controller.ExaminationController;
import controller.UserController;
import view.PacientView;
import view.ExaminationView;

public class Main {

   private static Scanner sc = new Scanner(System.in);
   private static ExaminationController examinationController = new ExaminationController();
   private static UserController pacientController = new UserController(examinationController);
   private static PacientView acceptPacientView = new PacientView(sc, pacientController);
   private static ExaminationView examinationView = new ExaminationView(sc, pacientController);

   public static void init() {
      examinationController.setUserController(pacientController);
      // tu sa mozu vytovrit nejak
   }
    public static void main(String[] args) {
      init();
      while(true) {
         int scenarioNumber;
         System.out.println("Zadaj cislo scenara: ");
         scenarioNumber = sc.nextInt();
         if (scenarioNumber == 0) { break; }
         switch(scenarioNumber) {
            case 1:
               // Sem vzdy pride volanie funkcie nejakeho view
               // a tam sa budu diat dalsie inputy a outputy
               System.out.println("Scenar c.1");
               break;
            case 2:
               examinationView.examinePacient();
               break;
            case 9:
               acceptPacientView.acceptPatient();
               break;
            default: break;
         }
      }
      sc.close();
    }
 }