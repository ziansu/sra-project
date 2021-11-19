@java.lang.Override
public c346ut.ILinkedList<T> after(int n) {
    for (int i = 0; i < n; i++) {
        next = next.next();
    }
    return next;
}