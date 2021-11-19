public void setCurrentState(com.jamescho.game.state.State newState) {
    java.lang.System.gc();
    mCurrentState = newState;
    newState.init();
    mInputHandler.setCurrentState(mCurrentState);
}