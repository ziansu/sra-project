public void stopFullscreen() {
    if (!(fullscreen))
        return ;
    
    fullscreen = false;
    dispose();
    setUndecorated(false);
    setBounds(100, 100, 700, 490);
    setResizable(true);
    setVisible(true);
}