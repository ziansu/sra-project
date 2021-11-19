public void Add(T element) {
    if (isEmpty()) {
        root = new com.filbin.Enumerables.Tree.Node<T>(null, null, element);
    }else {
        addTo(root, element);
    }
    (count)++;
}