protected float getCurrentFrame(float delta) {
    frame += delta;
    if (((frame) >= 1) && ((callbackFinish) != null)) {
        finish();
        callbackFinish.finish(this);
    }
    return frame;
}