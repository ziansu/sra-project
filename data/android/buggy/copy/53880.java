private void stopTimer() {
    if ((gameRunner.getPaused()) == true)
        return ;
    
    playPauseButton.setText("Play");
    gameRunner.stopTimer();
}