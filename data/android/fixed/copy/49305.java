public void hangup() {
    if ((appController) != null)
        appController.stop();
    
    if ((call) != null)
        call.hangup();
    
}