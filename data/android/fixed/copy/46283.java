@java.lang.Override
public void onEnd(boolean isWinner) {
    endTime = java.lang.System.nanoTime();
    long elapsedTime = (endTime) - (startTime);
    elapsedTime = java.util.concurrent.TimeUnit.NANOSECONDS.toSeconds(elapsedTime);
    productionManager.onEnd(isWinner, elapsedTime);
}