@java.lang.Override
public T poll() {
    if ((begin) == null) {
        return null;
    }
    T element = begin.value;
    begin = begin.next;
    return element;
}