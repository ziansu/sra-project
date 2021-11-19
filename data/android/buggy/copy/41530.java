@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    try {
        if (!(mInitSuccesful))
            initRecorder(mHolder.getSurface());
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}