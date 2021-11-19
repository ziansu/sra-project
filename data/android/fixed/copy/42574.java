@java.lang.Override
public boolean isEmpty() {
    reactor.core.publisher.FluxReplay.State<T> p = parent;
    return (p == null) || (p.buffer.isEmpty(this));
}