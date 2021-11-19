private void draw() {
    if (defer)
        return ;
    
    onscreen.drawImage(offscreenImage, 0, 0, null);
    frame.repaint();
}