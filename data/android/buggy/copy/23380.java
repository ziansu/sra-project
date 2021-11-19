public simulation.ScheduledRoute get() {
    simulation.ScheduledRoute nextScheduledRoute = queue.poll();
    currentTime = nextScheduledRoute.getTimestamp();
    return nextScheduledRoute;
}