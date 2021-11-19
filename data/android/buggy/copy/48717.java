@java.lang.Override
public boolean add(final java.lang.String e) {
    ensureIndexCorrectness();
    selectedMessages.add(index, e);
    return true;
}