@java.lang.Override
public TT next() {
    TT head = list.head;
    list = list.tail;
    (size)--;
    return head;
}