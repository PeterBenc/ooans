import java.util.Scanner;

import controller.PacientController;
import view.AcceptPacientView;
import view.ExaminationView;

public class Main {

   private static Scanner sc = new Scanner(System.in);
   private static ExaminationView examinationView = new ExaminationView(sc);
   private static PacientController pacientController = new PacientController();
   private static AcceptPacientView acceptPacientView = new AcceptPacientView(sc, pacientController);

   public static void init() {
      //toto musi vytovrit najprv vsetkych kontrollerov ktorych sa da
      //potom vsetky view
      // potom napr nejakych namockovanych pacientov a tak
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