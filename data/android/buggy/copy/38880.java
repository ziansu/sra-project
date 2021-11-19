@java.lang.Override
public E poll() {
    if ((head.next) == null) {
        return null;
    }
    head = head.next;
    return head.elem;
}