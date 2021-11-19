@java.lang.Override
public boolean drawFrame(android.graphics.drawable.Drawable parent, android.graphics.Canvas canvas, int frameNumber) {
    return ((mAnimationBackend) != null) && (mAnimationBackend.drawFrame(parent, canvas, frameNumber));
}