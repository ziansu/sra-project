@java.lang.Override
public void run() {
    java.lang.System.out.println("lmao");
    nl.han.oose.myenergyprofile.service.sensor.Mover.updateTracker(pocketService.isWalking(), pocketService.isStanding(), pocketService.isSitting());
}