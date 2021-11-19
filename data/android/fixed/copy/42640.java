public void setRadius(int radius) {
    if ((mRadius) == radius) {
        return ;
    }
    mRadius = radius;
    invalidate();
}