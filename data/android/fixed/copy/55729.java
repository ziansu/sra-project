@java.lang.Override
public void onCaptureRegionMoved(int x, int y) {
    if ((sharer) != null)
        sharer.setCaptureCoordinates(x, y);
    
}