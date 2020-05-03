package view;

import java.util.Scanner;

import controller.ExaminationController;
import controller.UserController;
import users.Pacient;

public class ExaminationView {

    protected Scanner sc;
    protected UserController userController;
    private ExaminationController examinationController;

    public ExaminationView(Scanner sc, ExaminationController examinationController) {
        this.sc = sc;
        this.examinationController = examinationController;
    }

    public void examinePacient() {
        System.out.println("Zadaj id pacienta");
        String name = sc.nextLine();
        //tu by mohlo byt vyprintovanie vysetrenia aspon nech ma meno
        System.out.println("Zadajte pristroj potrebny na vykonanie vysetrenia");
        String machine = sc.nextLine();
        this.examinationController.examinePacient(name, machine);
        System.out.println("Vysetrenie bolo vykonane" + name);
        // tu bude ze chcete vytvorit hospitalizaciu
        // ked tak sa zmeni ta strategy a zas sa zavola create events, 
    }
}