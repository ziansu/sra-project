@java.lang.Override
public final void setValue(final java.lang.String expression) throws org.eclipse.debug.core.DebugException {
    edu.kit.iti.formal.pse.worthwhile.model.Value value = this.getDebugTarget().evaluateExpression(expression);
    this.setValue(new edu.kit.iti.formal.pse.worthwhile.debugger.model.WorthwhileValue(this.getDebugTarget(), value));
}