public void setCurrentStepPosition(int currentStepPosition) {
    this.currentStepPosition = currentStepPosition;
    if ((pagerScrollState) == 0) {
        invalidate();
    }
}