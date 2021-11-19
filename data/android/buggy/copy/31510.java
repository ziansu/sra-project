@java.lang.Override
public void add(int index, E element) {
    markAsStale();
    underlyingList.add(index, element);
}