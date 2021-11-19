@java.lang.Override
public boolean isEmpty() {
    reactor.core.publisher.FluxReplay.State<T> p = parent;
    if (p != null) {
        return p.buffer.isEmpty(this);
    }
    return true;
}