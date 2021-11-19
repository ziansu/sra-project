private static java.lang.String getStationId(javax.servlet.http.HttpServletRequest request) {
    java.lang.String stationId = request.getHeader("STATION-ID");
    return stationId;
}