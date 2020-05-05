package machines;


public class MachineFactory {

    public Machine getMachine(String machineType, MachineMediator machineMediator) {
        if (machineType == null)
            return null;
        else if (machineType.equalsIgnoreCase("CT"))
            return new CTMachine(machineMediator);
//    else if (machineType.equalsIgnoreCase("EKG"))
//        return new EKGMachine(machineMediator);
        else if (machineType.equalsIgnoreCase("MRI"))
            return new MRIMachine(machineMediator);

        return null;

    }


}
