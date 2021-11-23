public void setStage(messageapp.gui.Stage newStage) {
    this.stage = newStage;
    if (newStage != null)
        newStage.setup();
    
}