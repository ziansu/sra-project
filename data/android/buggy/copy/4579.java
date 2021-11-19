@java.lang.Override
public void onSizeChanged(int w, int h, int oldW, int oldH) {
    surfW = w;
    surfH = h;
    matchSurfaceToPreviewRatio();
}