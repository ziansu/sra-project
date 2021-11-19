@java.lang.Override
public java.util.List<com.chariot.shadow.item.Item> pollFirst() {
    requested.addAndGet(size);
    java.lang.System.out.println((("Getting " + (size)) + " elements to executing"));
    return store.poll();
}