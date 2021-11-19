public void endTutorial() {
    isActive = false;
    if ((engine.GlobalData.getCurrentState()) instanceof engine.state.MainGame) {
        ((engine.state.MainGame) (engine.GlobalData.getCurrentState())).formManager.clearTutorial();
    }
    saveProgress();
}