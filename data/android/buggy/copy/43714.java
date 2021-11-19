public void removeFace(int index) {
    com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.get(index).stopSound();
    com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.remove(index);
    android.util.Log.d("fffa", "fffafffafffafffafffafffafffafffafffafffa");
}