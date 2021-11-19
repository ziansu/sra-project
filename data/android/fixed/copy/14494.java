@java.lang.Override
public final boolean verifyValue(final java.lang.String expression) throws org.eclipse.debug.core.DebugException {
    edu.kit.iti.formal.pse.worthwhile.model.Value value = this.getDebugTarget().evaluateExpression(expression);
    return this.verifyValue(new edu.kit.iti.formal.pse.worthwhile.debugger.model.WorthwhileValue(this.getDebugTarget(), this, value));
}