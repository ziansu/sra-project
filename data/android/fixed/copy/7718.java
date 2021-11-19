@java.lang.Override
public void actionPerformed(floobits.windows.AnActionEvent e) {
    if ((context) == null) {
        return ;
    }
    floobits.common.protocol.handlers.FlooHandler handler = context.getFlooHandler();
    if (handler == null) {
        return ;
    }
    handler.state.setFollowing(false);
}