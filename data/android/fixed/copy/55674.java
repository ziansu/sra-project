public void mouseClick(int buttonId, boolean down) {
    if ((streamInterface) == null)
        return ;
    
    streamInterface.mouseButtonEvent(buttonId, down);
}