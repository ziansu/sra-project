private void UpdateMovementTimer() {
    mMovementTimer.removeCallbacks(mTimerTask);
    mMovementTimer.postDelayed(mTimerTask, mContext.getResources().getInteger(R.integer.NotificationDelay));
}