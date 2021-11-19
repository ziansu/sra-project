public com.badlogic.gdx.math.Matrix4 getEyeView() {
    if (needUpdate) {
        needUpdate = false;
        updateEyeView();
    }
    return this.eyeView;
}