@java.lang.Override
public void onUndo(final C context, final org.wirez.core.command.delegate.Command<C, V> command, final org.wirez.core.command.delegate.CommandResult<V> result) {
    postUndo(context, command, result);
}