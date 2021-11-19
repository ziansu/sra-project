public void setProgress(int progress) {
    if ((progress > 0) && (progress <= ((numberOfSteps) + 1))) {
        progressBar.setProgress(progress);
    }
}