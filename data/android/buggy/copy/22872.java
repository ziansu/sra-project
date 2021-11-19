@java.lang.Override
protected java.util.Iterator<T> reverseIterator() {
    return new br.com.zbra.androidlinq.ArrayStream.ArrayIterator<>(source, ((source.length) - 1), (-1), (-1));
}