public void changeWaypoint(int taskIndex, int waypointIndex, com.droneemployee.client.common.Coordinate newCoordinate) {
    tasks.get(taskIndex).setWaypoint(waypointIndex, newCoordinate);
    for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
        observer.updateWaypoint(taskIndex, waypointIndex, newCoordinate);
    }
}