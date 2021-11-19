@java.lang.Override
public E get(int index) {
    org.tanc.algorithm.list.impl.LinkListImpl.Node<E> node = getNode(index);
    return node.item;
}