public topl.Checker.Queue<T> push(T x) {
    assert x != null;
    return topl.Checker.Queue.mk(front, topl.Checker.Queue.N.mk(x, back), ((hash) + (x.hashCode())));
}