public void stopFullscreen() {
    if (!(fullscreen))
        return ;
    
    dispose();
    setUndecorated(false);
    setBounds(100, 100, 700, 490);
    setResizable(true);
    setVisible(true);
}