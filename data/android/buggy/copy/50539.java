@java.lang.Override
protected org.knime.core.node.port.PortObject[] executeImpl(org.knime.core.node.port.PortObject[] inData, org.knime.core.node.ExecutionContext exec) throws java.lang.Exception {
    try {
        pushInputToR(inData, exec);
    } catch (de.mpicbg.knime.scripting.core.exceptions.KnimeScriptingException | org.knime.core.node.CanceledExecutionException e) {
        closeRConnection();
    }
    return null;
}