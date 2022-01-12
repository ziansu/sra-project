public static java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable command) {
    return com.bustracker.trip.thread.TripStopThreads.INSTANCE.schedule(command, 1, java.util.concurrent.TimeUnit.MINUTES);
}