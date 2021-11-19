@java.lang.Override
public boolean offer(int ordinal, @javax.annotation.Nonnull
java.lang.Object item) {
    return (wrappedOutbox.offer(ordinal, item)) && (log(item));
}