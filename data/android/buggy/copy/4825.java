@java.lang.Override
public org.ggp.base.util.statemachine.MachineState getInitialState() {
    org.ggp.base.util.propnet.architecture.components.Proposition initial = propNet.getInitProposition();
    initial.setValue(true);
    return getStateFromBase();
}