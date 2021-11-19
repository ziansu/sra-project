@java.lang.Override
public com.wincom.dcim.agentd.statemachine.State enter(com.wincom.dcim.agentd.primitives.HandlerContext ctx) {
    ctx.send(new com.wincom.dcim.agentd.primitives.SetMillsecFromNowTimer(millsec));
    ctx.set("timeout.millsec", millsec);
    return this;
}