package controller;

import events.Examination;
import machines.*;
import pacientPlanStrategies.HospitalizationPlanner;
import schedule.ExaminationIterator;
import users.Pacient;

import java.lang.management.ManagementFactory;

public class ExaminationController {

    private UserController userController;
    private MachineMediator machineMediator = new MachineMediator();
    MachineFactory factory=new MachineFactory();
    public ExaminationController(UserController userController) {
        this.userController = userController;
    }
    
    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public void examinePacient(String name, String machineName) {

        Pacient pacient = this.userController.getPacient(name);
//        Machine machine = machineName.equals("CT")
//            ? /*new CTMachine(this.machineMediator)*/ factory.getMachine("CT",this.machineMediator)
//            :/* new MRIMachine(this.machineMediator)*/ factory.getMachine("MRI",this.machineMediator)
//        ;
        Machine machine =factory.getMachine(machineName,this.machineMediator);
        EKGMachine ekgMachine = new EKGMachine(this.machineMediator)/*factory.getMachine("EKG",this.machineMediator)*/;
        machineMediator.setEkgMachine(ekgMachine);
        machineMediator.setMachine(machine);
        pacient.setEkgMachine(ekgMachine);
        pacient.setMachine(machine);


        ExaminationIterator examinationIterator= (ExaminationIterator) pacient.getSchedule().createIterator();
         System.out.println("Vykonaj nevykonane vysetrenia");
        while(examinationIterator.hasNext())   // iterator
        {
            Examination examination = (Examination)examinationIterator.next();
            if(examination!=null) {

                System.out.print(examination + " , ");
                machine.executeExamination(examination);  // volanie template method
            }
        }


        pacient.setSchedulePlanner(userController.getHospitalizationPlanner());  // preco nastavime po vysetreniach gethospilaztion planner
        pacient.createSchedule();
    }
}