public static <T> net.coljate.list.impl.MutableWrappedArrayList<T> copyOf(final net.coljate.collection.Collection<? extends T> collection) {
    final java.util.ArrayList<T> list = collection.mutableJavaCopy(java.util.ArrayList::new);
    return net.coljate.list.impl.MutableWrappedArrayList.viewOf(list);
}