@java.lang.Override
public boolean drawFrame(android.graphics.drawable.Drawable parent, android.graphics.Canvas canvas, int frameNumber) {
    if ((mAnimationBackend) != null) {
        return mAnimationBackend.drawFrame(parent, canvas, frameNumber);
    }
    return false;
}