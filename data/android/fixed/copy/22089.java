public void mouseMove(int deltaX, int deltaY) {
    if ((streamInterface) == null)
        return ;
    
    streamInterface.mouseMove(deltaX, deltaY);
}