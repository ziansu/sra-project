protected void onReleased() {
    if (this.mTouched) {
        this.mTouched = false;
        this.startCheckMoving();
        if ((this.mMapListener) != null) {
            this.mMapListener.onReleased();
        }
    }
}