package view;

import java.util.Scanner;

import controller.ExaminationController;
import model.Pacient;

public class ExaminationView {

    public ExaminationView() {

    }
    protected Scanner sc;
    protected ExaminationController examinationController;

    public ExaminationView(Scanner sc){
        this.sc = sc;
    }

    public void examinePacient() {
        System.out.println("Zadaj id pacienta");
        int pacientId = sc.nextInt();
        System.out.println("Vysetrenie bolo vykonane" + pacientId);
    }
}