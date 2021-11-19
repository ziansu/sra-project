@java.lang.Override
public void addState(T state) {
    assert !(states.contains(state));
    states.add(state);
}