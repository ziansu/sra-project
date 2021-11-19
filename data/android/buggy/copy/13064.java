@java.lang.Override
public int getSize() {
    int size = 0;
    while ((first.next) == null) {
        first = first.next;
        size++;
    } 
    return size;
}