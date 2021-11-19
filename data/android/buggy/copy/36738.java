@java.lang.Override
public boolean hasVariables() throws org.eclipse.debug.core.DebugException {
    if (!(initialized)) {
        initialize();
    }
    return !(transformationVariables.isEmpty());
}