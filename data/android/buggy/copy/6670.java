@java.lang.Override
public void imageComplete(javax.imageio.ImageReader source) {
    if (isProgressRangeCorrected()) {
        processImageComplete();
    }
}