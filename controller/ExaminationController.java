package controller;

import events.Examination;
import machines.*;
import pacientPlanStrategies.HospitalizationPlanner;
import schedule.ExaminationIterator;
import users.Doctor;
import users.Pacient;

import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class ExaminationController {
    protected Scanner sc= new Scanner(System.in);
    private UserController userController;
    private MachineMediator machineMediator = new MachineMediator();
    MachineFactory factory = new MachineFactory();

    public ExaminationController(UserController userController) {
        this.userController = userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public void examinePacient(String name/*, String machineName*/) {
        Doctor doctor = this.userController.getDoctor();
        Pacient pacient = this.userController.getPacient(name);
        if (doctor.getIsPacientReady() == false) {
            System.out.println("Pacient nie je prevezeny na vysetrenie");
            return;
        }

        ExaminationIterator examinationIterator = (ExaminationIterator) pacient.getSchedule().createIterator();
        System.out.println("Vykonaj nevykonane vysetrenia");
        while (examinationIterator.hasNext())   // iterator
        {
            Examination examination = (Examination) examinationIterator.next();
            if (examination != null) {
                System.out.println("Zadajte pristroj potrebny pre vysetrenie "+ examination);

                String machineName = sc.nextLine();
                Machine machine = factory.getMachine(machineName, this.machineMediator);
                EKGMachine ekgMachine = new EKGMachine(this.machineMediator)/*factory.getMachine("EKG",this.machineMediator)*/;
                machineMediator.setEkgMachine(ekgMachine);
                machineMediator.setMachine(machine);
                pacient.setEkgMachine(ekgMachine);
                pacient.setMachine(machine);

                //System.out.println(examination);
                machine.executeExamination(examination);  // volanie template method
                System.out.println("Vysetrenie bolo vykonane");
            }
        }
        doctor.setIsPacientReady(false);


        pacient.setSchedulePlanner(userController.getHospitalizationPlanner());
        pacient.createSchedule(doctor);
    }
}