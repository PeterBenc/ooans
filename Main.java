import java.util.Scanner;

import view.ExaminationView;

public class Main {

   private static Scanner sc = new Scanner(System.in);
   private static ExaminationView examinationView = new ExaminationView(sc);
    public static void main(String[] args) {
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
               System.out.println("Scenar c.1");
               break;
            default: break;
         }
      }
      sc.close();
    }
 }