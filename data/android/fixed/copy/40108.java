@java.lang.Override
public org.kframework.debugger.DebuggerState resume() {
    org.kframework.kore.K previousK;
    do {
        previousK = activeState.getCurrentK();
        step(checkpointInterval);
    } while (!(previousK.equals(activeState.getCurrentK())) );
    return activeState;
}