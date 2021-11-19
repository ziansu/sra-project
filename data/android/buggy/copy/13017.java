public void zoomOut(@android.support.annotation.NonNull
final android.opengl.GLSurfaceView view) {
    zoom(view, mIndex, ((VIEW_SIZE) / 2), _R, _R_NEAR, 0, FAR);
}