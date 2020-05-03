package controller;

import machines.CTMachine;
import machines.MRIMachine;
import machines.MachineMediator;
import pacientPlanStrategies.HospitalizationPlanner;
import users.Pacient;

public class ExaminationController {

    private UserController userController;
    private MachineMediator machineMediator = new MachineMediator();

    public ExaminationController() {

    }
    
    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public void examinePacient(String name, String machineName) {
        Pacient pacient = this.userController.getPacient(name);
        pacient.setMachine(machineName.equals("CT") 
            ? new CTMachine(this.machineMediator)
            : new MRIMachine(this.machineMediator)
        );
        // this.machineMediator.
        // tu zavolas metodu z view aby vypisala eventy resp null object..
        // metoda co zobrazi detaily vysetrenia, ak neni chceme dat nullObject a skoncit
        // tu uz ide volanie examinationControllera
        
    }
}