public void removeOutput(com.xross.tools.xstate.editor.model.StateTransition output) {
    if (!(outputs.contains(output)))
        return ;
    
    outputs.remove(output);
    firePropertyChange(com.xross.tools.xstate.editor.model.PROP_OUTPUTS);
}