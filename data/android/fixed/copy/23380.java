public simulation.ScheduledRoute get() {
    simulation.ScheduledRoute nextScheduledRoute = queue.poll();
    if (nextScheduledRoute != null)
        currentTime = nextScheduledRoute.getTimestamp();
    
    return nextScheduledRoute;
}