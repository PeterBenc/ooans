package view;

import java.util.Scanner;

import controller.ExaminationController;
import controller.UserController;
import org.w3c.dom.Text;
import users.Pacient;

public class ExaminationView {

    protected Scanner sc;
    protected UserController userController;
    private ExaminationController examinationController;
    SubMenu mainMenu = new SubMenu();
    Button chooseMachine = new Button("Vyber zariadenie");
    TextField idPatient = new TextField("Id pacienta: ");
    Button machineEKG = new Button("EKG");
    Button machineMRI = new Button("MRI");
    Button machineCT = new Button("CT");
    SubMenu subMenu = new SubMenu();
    Button machineSettings = new Button("Uloz nastavenia zariadenia");
    TextField settings = new TextField("Nastavenie: ");
    Button startExamination = new Button("Vykonaj vysetrenie");


    public ExaminationView(Scanner sc, ExaminationController examinationController) {
        this.sc = sc;
        this.examinationController = examinationController;
        mainMenu.add(chooseMachine);
        mainMenu.add(machineEKG);
        mainMenu.add(machineMRI);
        mainMenu.add(machineCT);
        mainMenu.add(idPatient);
        subMenu.add(machineSettings);
        subMenu.add(settings);
        subMenu.add(startExamination);
        mainMenu.add(subMenu);


    }

    public void examinePacient() {
        mainMenu.render();
        System.out.println("Zadaj meno pacienta");
        String name = sc.nextLine();
        //tu by mohlo byt vyprintovanie vysetrenia aspon nech ma meno
        System.out.println("Zadajte pristroj potrebny na vykonanie vysetrenia");
        String machine = sc.nextLine();
        this.examinationController.examinePacient(name, machine);
        System.out.println("Vysetrenie bolo ukoncene");
        // tu bude ze chcete vytvorit hospitalizaciu
        // ked tak sa zmeni ta strategy a zas sa zavola create events, 
    }
}