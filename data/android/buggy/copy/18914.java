public void updateProjection(int videoWidth, int videoHeight) {
    this.videoWidth = videoWidth;
    this.videoHeight = videoHeight;
    com.martin.ads.vrlib.utils.MatrixUtils.updateProjection(videoWidth, videoHeight, surfaceWidth, surfaceHeight, adjustingMode, projectionMatrix);
}