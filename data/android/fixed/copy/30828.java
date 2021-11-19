@java.lang.Override
public void run() {
    nl.han.oose.myenergyprofile.service.sensor.Mover.updateTracker(pocketService.isWalking(), pocketService.isStanding(), pocketService.isSitting());
}