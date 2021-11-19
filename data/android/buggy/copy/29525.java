@java.lang.Override
public void surfaceCreated(final example.videoplayer.SurfaceHolder surfaceHolder) {
    synchronized(this) {
        hasActiveHolder = true;
        this.notifyAll();
    }
    if ((completeListener) != null) {
        completeListener.onComplete(surfaceHolder);
    }
}