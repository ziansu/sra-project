@java.lang.Override
public void run() {
    if (illarion.client.util.ConnectionPerformanceClock.isReadyForNewPing()) {
        illarion.client.util.ConnectionPerformanceClock.notifySendToNetComm();
        illarion.client.world.World.getNet().sendCommand(keepAliveCmd);
    }
}