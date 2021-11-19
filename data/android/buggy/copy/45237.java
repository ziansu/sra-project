@java.lang.Override
public void call(elemental.json.JsonArray arguments) throws elemental.json.JsonException {
    setCurrentState(arguments.getObject(0));
    for (com.kbdunn.vaadin.addons.mediaelement.interfaces.CanPlayListener listener : canPlayListeners)
        listener.canPlay(getMe());
    
}