@java.lang.Override
public void run() {
    if ((!(editTextComment.hasFocus())) && ((mMediaController) != null)) {
        mMediaController.setVisibility(View.GONE);
    }else {
        timer.cancel();
    }
}