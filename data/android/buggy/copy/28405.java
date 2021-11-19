@java.lang.Override
public void deactivated(java.util.Map<java.lang.Object, java.lang.Object> properties, org.shaman.rpg.engine.core.states.ExtAppState nextState) {
    if ((this.nextState) == null) {
        stateManager.detach(PauseAppState.INSTANCE);
    }
    org.shaman.rpg.engine.core.obj.fade.FadeAppState.LOG.log(java.util.logging.Level.FINE, "deactivated: nextState={0}", this.nextState);
}