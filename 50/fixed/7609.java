public void addStateChangedListener(com.example.uicomponents.MultistateSwitch.StateChangedListener listener) {
    if (listener == null)
        return ;
    
    mListeners.add(listener);
}