public void actionPerformed(java.awt.event.ActionEvent e) {
    soundPlayer.myStop();
    if (!(setTargetFile())) {
        return ;
    }
    int aaa;
    changeStatePlay();
    soundPlayer.myPlay();
    timerStart();
}