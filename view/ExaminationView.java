package view;

import java.util.Scanner;

import controller.ExaminationController;
import controller.UserController;
import users.Pacient;

public class ExaminationView {

    protected Scanner sc;
    protected UserController pacientController;

    public ExaminationView(Scanner sc, UserController pacientController){
        this.sc = sc;
        this.pacientController = pacientController;
    }

    public void examinePacient() {
        System.out.println("Zadaj id pacienta");
        String name = sc.nextLine();
        this.pacientController.examinePacient(name);
        System.out.println("Vysetrenie bolo vykonane" + name);
        // tu bude ze chcete vytvorit hospitalizaciu
        // ked tak sa zmeni ta strategy a zas sa zavola create events, 
    }
}