import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(true) {
         int scenarioNumber;
         System.out.println("Zadaj cislo scenara: ");
         scenarioNumber = sc.nextInt();
         
         switch(scenarioNumber) {
            case 0: return;

            case 1: 
               System.out.println("Scenar c.1");
               break;
            default: return;
         }
      }
    }
 }