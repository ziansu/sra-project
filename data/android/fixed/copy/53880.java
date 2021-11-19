private void stopTimer() {
    if ((gameRunner.getPaused()) == true)
        return ;
    
    gameRunner.stopTimer();
}