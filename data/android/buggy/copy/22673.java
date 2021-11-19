public void handlePelvisTrajectoryCommand(us.ihmc.humanoidRobotics.communication.controllerAPI.command.PelvisTrajectoryCommand command) {
    tempPelvisOrientationTrajectoryCommand.set(command);
    handlePelvisOrientationTrajectoryCommands(tempPelvisOrientationTrajectoryCommand);
}