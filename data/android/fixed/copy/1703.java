public boolean breakSnapMirror(java.lang.String destLocation, java.lang.String relationShipId) {
    com.iwave.ext.netappc.SnapMirror snapMirror = new com.iwave.ext.netappc.SnapMirror(server.getNaServer(), null);
    return snapMirror.breakSnapMirror(destLocation, relationShipId);
}