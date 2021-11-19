@java.lang.Override
public void receiveToggle(final int toggleId, final boolean active) {
    uk.co.modularaudio.mads.base.scope.ui.ScopeDisplayUiJComponent.log.trace(((("Received toggle of " + toggleId) + " to ") + active));
    waveDisplay.setSignalVisibility(toggleId, active);
}