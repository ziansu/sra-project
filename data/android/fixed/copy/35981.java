@java.lang.Override
public org.ggp.base.util.statemachine.StateMachine getInitialStateMachine() {
    return new org.ggp.base.util.statemachine.cache.CachedStateMachine(new org.ggp.base.util.statemachine.implementation.prover.ProverStateMachine());
}