public void start() {
    bePlaying = true;
    progressHandler.postDelayed(runnableProgress, com.lennonwoo.rubber.ui.widget.CircularProgressView.PROGRESS_DELAY);
    invalidate();
}