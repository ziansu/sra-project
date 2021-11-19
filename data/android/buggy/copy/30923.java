private int moveTargetView(float dy, boolean isDragging) {
    int target = ((int) ((mTargetCurrentOffset) + (dy * (mDragRate))));
    return moveTargetViewTo(target, isDragging);
}