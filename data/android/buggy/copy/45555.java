@java.lang.Override
public int size() {
    int size = 0;
    com.erbis.java.courses.algorithms.structure.impl.QueueElement carret = head;
    while (carret != null) {
        size++;
        carret = carret.getNext();
    } 
    return size;
}