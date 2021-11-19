@java.lang.Override
public void run() {
    this.mPrepressed = false;
    this.setPressed(true);
    if (this.mRippleHover) {
        startHover();
    }
}