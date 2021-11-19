@java.lang.Override
public E next() {
    (index)++;
    return ((E) ((java.lang.Number) (dataset.get(index, attr))));
}