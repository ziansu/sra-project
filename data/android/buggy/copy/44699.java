public elevator.ElevatorInterface getElevatorInterface(int elevatorID) {
    if ((elevatorID >= 0) && (elevatorID < (elevator.ElevatorGroup.numElevators)))
        return elevator.ElevatorGroup.ebi[elevatorID];
    else {
        java.lang.System.out.println("No Such floor.");
        return null;
    }
}