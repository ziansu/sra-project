@java.lang.Override
public boolean matches(final java.lang.Object[] args, final som.interpreter.nodes.ExpressionNode[] argNodess) {
    if (args == null) {
        return true;
    }
    return (args[0]) == (som.vm.constants.Classes.doubleClass);
}