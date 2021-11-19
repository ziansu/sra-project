private void startTimer() {
    if ((gameRunner.getPaused()) == false)
        return ;
    
    playPauseButton.setText("Pause");
    gameRunner.startTimer();
}