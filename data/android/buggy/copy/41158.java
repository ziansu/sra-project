@java.lang.Override
public void reset(java.lang.Character c) {
    org.jasr.dfa.memento.StringsMemento.LOGGER.debug(("Resetting memento with value: " + c));
    state.add(new java.lang.StringBuilder());
    update(c);
}