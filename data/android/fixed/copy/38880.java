@java.lang.Override
public E poll() {
    if ((head.next) == null) {
        return null;
    }
    head = head.next;
    --(size);
    return head.elem;
}