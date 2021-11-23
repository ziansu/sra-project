public static void updateRadarDistance(float newMaxDistance) {
    if (newMaxDistance < 0) {
        return ;
    }
    synchronized(com.jmlb0003.prueba3.controlador.ARDataSource.RADIUS_LOCK) {
        com.jmlb0003.prueba3.controlador.ARDataSource.sRadius = newMaxDistance;
    }
    synchronized(com.jmlb0003.prueba3.controlador.ARDataSource.sZoomLevel) {
        com.jmlb0003.prueba3.controlador.ARDataSource.sZoomLevel = com.jmlb0003.prueba3.controlador.ARDataSource.FORMAT.format(newMaxDistance);
    }
}