@java.lang.Override
public void onResume() {
    super.onResume();
    mCamera = android.hardware.Camera.open(0);
    android.hardware.camera2.CameraManager manager = ((android.hardware.camera2.CameraManager) (getActivity().getSystemService(Context.CAMERA_SERVICE)));
}