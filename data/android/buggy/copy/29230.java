@java.lang.Override
public int nextIndex() {
    return hasNext() ? (position)++ : (position) + 1;
}