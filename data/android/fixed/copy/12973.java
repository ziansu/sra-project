@javax.ws.rs.GET
@javax.ws.rs.Produces(value = "application/json")
@javax.ws.rs.Path(value = "centered")
public java.util.List<com.openshift.evg.roadshow.model.DataPoint> findDataPointsCentered(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse response, float lat, float lon, int maxDistance, int minDistance) {
    return new java.util.ArrayList<com.openshift.evg.roadshow.model.DataPoint>();
}