private java.lang.String pathForCreateGhost(com.pm.server.datatype.Coordinate location) {
    return ((((com.pm.server.controller.GhostControllerTest.BASE_MAPPING) + "/") + (location.getLatitude())) + "/") + (location.getLongitude());
}