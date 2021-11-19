private void notifyRotationComplete() {
    if (canNotifySpectators()) {
        for (uk.ac.bris.cs.scotlandyard.model.Spectator spectator : getSpectators()) {
            spectator.onRotationComplete(this);
        }
    }
    DEBUG_PRINT("====== END ROUND ======");
}