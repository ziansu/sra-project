public boolean onClick(float x, float y) {
    if (mRectMode.contains(x, y)) {
        if ((mCallbacks) != null) {
            mCallbacks.onModeClick();
        }
        return true;
    }
    return false;
}