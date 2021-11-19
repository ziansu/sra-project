@java.lang.Override
public boolean hasNext() {
    return lookAhead(1).isPresent();
}