@java.lang.Override
public void cleanup(delta.soen390.mapsters.Activities.MapsActivity activity) {
    delta.soen390.mapsters.Utils.GoogleMapCamera camera = activity.getGoogleMapCamera();
    camera.allowIndoorsDisplay(true);
}