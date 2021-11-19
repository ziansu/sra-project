@java.lang.Override
public c346ut.ILinkedList<T> last() {
    while ((next.next()) != null) {
        next = next.next();
    } 
    return next;
}