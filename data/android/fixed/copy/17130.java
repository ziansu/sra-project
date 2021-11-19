public void setModeAndReset(boolean runMode, de.neemann.digital.gui.sync.Sync modelSync) {
    this.modelSync = modelSync;
    if (runMode)
        mouseRun.activate();
    else {
        mouseNormal.activate();
        circuit.clearState();
    }
    requestFocusInWindow();
}