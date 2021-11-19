private void startRecord() {
    initRecorder();
    startVirtual();
    mediaRecorder.start();
    isREC = true;
    mFloatView.setBackgroundColor(Color.RED);
}