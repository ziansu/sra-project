@butterknife.OnClick(value = R.id.cancelButton)
public void cancelTimer() {
    mPause.setVisibility(View.INVISIBLE);
    mCancel.setVisibility(View.INVISIBLE);
    mStart.setVisibility(View.VISIBLE);
    mResume.setVisibility(View.INVISIBLE);
    mActive = false;
    mPaused = false;
    reset();
}