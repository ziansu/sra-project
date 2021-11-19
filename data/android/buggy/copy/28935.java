public void setAnimationTime(int animationTime) {
    stopAnimation();
    this.animationTime = animationTime;
    reinitialize();
}