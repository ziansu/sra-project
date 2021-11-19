public void set(final T value) {
    try {
        mField.set(mInstance, value);
    } catch (final java.lang.IllegalAccessException ignored) {
    }
}