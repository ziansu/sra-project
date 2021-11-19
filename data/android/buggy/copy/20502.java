public void setProgress(int progress) {
    if ((progress > 0) && (progress <= (numberOfSteps))) {
        progressBar.setProgress(progress);
    }
}