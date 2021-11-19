@java.lang.Override
protected int getSuggestedMinimumHeight() {
    if (directionControl) {
        return (mHolderWidth) + (((mChildSize) + (com.bvapp.arcraymenu.RayLayout.DEFAULT_CHILD_GAP)) * (getChildCount()));
    }else {
        return mChildSize;
    }
}