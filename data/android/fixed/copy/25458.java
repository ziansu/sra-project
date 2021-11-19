@java.lang.Override
public void run() {
    io.kuzzle.demo.demo_android.BlinkingMarker marker = markerList.get(userId);
    if (marker != null) {
        marker.stopBlinking().removeMarker();
        markerList.remove(userId);
    }
}