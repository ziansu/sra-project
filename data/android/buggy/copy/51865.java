@java.lang.Override
public boolean isTerminal(org.ggp.base.util.statemachine.MachineState state) {
    markBases(state);
    return getPropMark(propNet.getTerminalProposition());
}