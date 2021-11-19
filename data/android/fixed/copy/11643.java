@java.lang.Override
public synchronized void onTurnEnded(final com.hutgroup.robocode.server.TurnEndedEvent event) {
    newRoundResult = java.util.Arrays.asList(event.getTurnSnapshot().getRobots());
}