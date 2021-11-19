public java.util.List<pi.obstacleSeeker.ObstaclePoint> getObstaclePoints() {
    try {
        return robotRMI.getObstaclePoints();
    } catch (java.rmi.RemoteException e) {
    }
    return null;
}