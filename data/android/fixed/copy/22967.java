@java.lang.Override
public datastructures.heap.PriorityQueueElement<P, V> extract() {
    datastructures.heap.PriorityQueueElement<P, V> element = super.extract();
    elementsMap.remove(element.getValue());
    return element;
}