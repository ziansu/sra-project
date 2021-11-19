@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d("GStreamer", ("Surface created: " + (surfaceHolder.getSurface())));
    nativeSurfaceInit(surfaceHolder.getSurface());
}