@java.lang.Override
public void onCameraUnavailable(@android.support.annotation.NonNull
java.lang.String cameraId) {
    super.onCameraUnavailable(cameraId);
    if (proto.ttt.cds.green_data.Class.SequencePictureTaker.DEBUG)
        android.util.Log.d(proto.ttt.cds.green_data.Class.SequencePictureTaker.TAG, ("onCameraUnavailable, id = " + cameraId));
    
    updateUnavailableCameras(("" + cameraId), true);
}