public void exportRendering() {
    mRenderWindow.exportRendering(java.lang.String.valueOf(raytracer.Raytracer.stopTime(tStart)), mMaxRecursions, ((int) (mAntiAliasingSamples)), mDebug, mGiLevel, mGiSamples);
}