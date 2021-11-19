void updateTimeAvgStats() {
    double timeSinceLastEvent = eventList.timeSinceLastEvent();
    if ((serverStatus) == (MM1.ServerStatus.BUSY))
        stats.areaNumInQ += (queue.size()) * timeSinceLastEvent;
    
    stats.areaServerStatus += timeSinceLastEvent;
}