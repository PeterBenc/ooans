package view;

import java.util.Scanner;

import controller.ExaminationController;
import controller.PacientController;
import users.Pacient;

public class ExaminationView {

    protected Scanner sc;
    protected PacientController pacientController;

    public ExaminationView(Scanner sc, PacientController pacientController){
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