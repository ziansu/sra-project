private void startRecord() {
    if (null == (mediaRecorder)) {
        initRecorder();
    }
    startVirtual();
    mediaRecorder.start();
    isREC = true;
    mFloatView.setBackgroundColor(Color.RED);
}