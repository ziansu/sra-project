private void UpdateAnimation(long elapsedTime) {
    if ((timeSinceLastFrame) >= (getSecondsInFrame())) {
        (currentFrame)++;
        currentFrame = (totalFrames) % (currentFrame);
        timeSinceLastFrame = 0;
    }
    timeSinceLastFrame += elapsedTime;
}