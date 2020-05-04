package controller;

import machines.CTMachine;
import machines.EKGMachine;
import machines.MRIMachine;
import machines.Machine;
import machines.MachineMediator;
import pacientPlanStrategies.HospitalizationPlanner;
import users.Pacient;

public class ExaminationController {

    private UserController userController;
    private MachineMediator machineMediator = new MachineMediator();

    public ExaminationController(UserController userController) {
        this.userController = userController;
    }
    
    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public void examinePacient(String name, String machineName) {
        Pacient pacient = this.userController.getPacient(name);
        Machine machine = machineName.equals("CT") 
            ? new CTMachine(this.machineMediator)
            : new MRIMachine(this.machineMediator)
        ;
        EKGMachine ekgMachine = new EKGMachine(this.machineMediator);
        machineMediator.setEkgMachine(ekgMachine);
        machineMediator.setMachine(machine);
        pacient.setEkgMachine(ekgMachine);
        pacient.setMachine(machine);
        machine.executeExamination();
        pacient.setSchedulePlanner(userController.getHospitalizationPlanner());
        pacient.createSchedule();
    }
}