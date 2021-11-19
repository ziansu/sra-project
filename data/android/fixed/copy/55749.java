@java.lang.Override
public boolean apply(gobblin.configuration.WorkUnitState input) {
    return (null == input) || (!(WorkingState.SUCCESSFUL.equals(input.getWorkingState())));
}