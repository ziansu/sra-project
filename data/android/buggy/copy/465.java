public void setRotation(int index, jp.co.cyberagent.android.gpuimage.Rotation rotation) {
    rotations[index] = rotation;
    adjustImageScaling(index);
}