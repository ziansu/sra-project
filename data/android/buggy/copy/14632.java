@java.lang.Override
public void addListener(LISTENER_TYPE listener) {
    if (null == listener) {
        throw new java.lang.IllegalArgumentException("listener cannot be null.");
    }
    if (!(mRegistrar.contains(listener))) {
        mRegistrar.add(listener);
    }
}