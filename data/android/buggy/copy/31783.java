@java.lang.Override
public boolean hasNext() {
    if ((outputIterator) == null) {
        outputIterator = transform(com.google.common.collect.Lists.newArrayList(inputIterator)).iterator();
    }
    return outputIterator.hasNext();
}