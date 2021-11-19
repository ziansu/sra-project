@java.lang.Override
public java.util.Map.Entry<D, R> next() {
    java.util.Map.Entry<D, R> result = mNextEntry;
    mNextEntry = constructNext();
    return result;
}