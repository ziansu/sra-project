@java.lang.Override
public void onExecuteBatch(final C context, final java.util.Collection<org.wirez.core.command.delegate.Command<C, V>> commands, final org.wirez.core.command.batch.BatchCommandResult<V> result) {
    if (null != commands) {
        postExecuteBatch(context, commands, result);
    }
}