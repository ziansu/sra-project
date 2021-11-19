@java.lang.Override
public com.wincom.dcim.agentd.statemachine.State enter(com.wincom.dcim.agentd.primitives.HandlerContext ctx) {
    try {
        ctx.getHandler(message.getClass()).handle(ctx, message);
    } catch (java.lang.Throwable t) {
        t.printStackTrace();
    }
    return this;
}