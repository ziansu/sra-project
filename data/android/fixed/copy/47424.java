@java.lang.Override
public java.lang.String getOutgoing() {
    return makeCommand(org.python.pydev.debug.model.remote.CMD_REMOVE_BREAK, sequence, org.python.pydev.shared_core.string.StringUtils.join("\t", new java.lang.String[]{ type , file , java.lang.Integer.toString(breakpointId) }));
}