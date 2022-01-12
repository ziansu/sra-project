@java.lang.Override
public void reset() {
    for (com.funcache.util.FastLinkedListItem item = head; item != null; item = item.getNext()) {
        item.setNext(null);
        item.setPrevious(null);
    }
    head = null;
    tail = null;
}