@java.lang.Override
public boolean add(E item) {
    com.google.common.base.Preconditions.checkNotNull(item, "Item to be added cannot be null.");
    return items.add(serializer.encode(item));
}