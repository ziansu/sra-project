@java.lang.Override
protected int getSuggestedMinimumWidth() {
    if (directionControl) {
        return mChildSize;
    }else {
        return (mHolderWidth) + (((mChildSize) + (com.bvapp.arcraymenu.RayLayout.DEFAULT_CHILD_GAP)) * (getChildCount()));
    }
}