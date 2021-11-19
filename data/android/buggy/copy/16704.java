@java.lang.Override
public java.util.Map.Entry<D, R> next() {
    java.util.Map.Entry<D, R> result = mNextEntry;
    constructNext();
    return result;
}