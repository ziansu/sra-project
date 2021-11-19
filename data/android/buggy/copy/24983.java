public java.util.List<pi.obstacleSeeker.ObstaclePoint> getObstaclePoints() {
    try {
        return robotRMI.getObstaclePoints();
    } catch (java.rmi.RemoteException e) {
        java.lang.System.out.println("remote exception in getObstaclePoints in computer/RMIConnector");
    }
    return null;
}