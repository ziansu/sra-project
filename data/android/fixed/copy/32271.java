void keyEvent(java.awt.event.KeyEvent event) {
    if ((keyListener) != null)
        keyListener.onKeyEvent(event);
    
    for (soga2d.GraphicObject object : allItems()) {
        if (object != null)
            object.keyEvent(event);
        
    }
}