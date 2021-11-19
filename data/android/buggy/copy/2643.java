@java.lang.Override
public c346ut.ILinkedList<T> last() {
    c346ut.ILinkedList temp = this.next;
    while (temp != null) {
        temp.next();
    } 
    return next;
}