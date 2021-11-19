public void endTutorial() {
    isActive = false;
    ((engine.state.MainGame) (engine.GlobalData.getCurrentState())).formManager.clearTutorial();
    saveProgress();
}