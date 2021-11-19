public void mouseScroll(byte amount) {
    if ((streamInterface) == null)
        return ;
    
    streamInterface.mouseScroll(amount);
}