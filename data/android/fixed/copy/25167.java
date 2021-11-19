public com.anton46.stepsview.StepsView setCompletedPosition(int completedPosition) {
    mCompletedPosition = completedPosition;
    mStepsViewIndicator.setCompletedPosition(mCompletedPosition);
    return this;
}