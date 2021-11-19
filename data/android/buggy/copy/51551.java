@java.lang.Override
public boolean hasNext() {
    if ((curr.getNext()) != null) {
        return true;
    }
    return false;
}