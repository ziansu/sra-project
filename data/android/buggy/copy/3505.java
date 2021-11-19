@java.lang.Override
public boolean hasNext() {
    return lookAhead(0).isPresent();
}