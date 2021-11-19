public void removeInput(com.xross.tools.xstate.editor.model.StateTransition input) {
    if (!(inputs.contains(input)))
        return ;
    
    inputs.remove(input);
    firePropertyChange(com.xross.tools.xstate.editor.model.PROP_INPUTS);
}