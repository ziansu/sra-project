public void start() {
    java.lang.System.out.println();
    if (!(bePlaying)) {
        bePlaying = true;
        progressHandler.postDelayed(runnableProgress, com.lennonwoo.rubber.ui.widget.CircularProgressView.PROGRESS_DELAY);
        invalidate();
    }
}