@java.lang.Override
protected int getSuggestedMinimumHeight() {
    if (directionControl) {
        return (mHolderWidth) + ((mChildSize) * (getChildCount()));
    }else {
        return mChildSize;
    }
}