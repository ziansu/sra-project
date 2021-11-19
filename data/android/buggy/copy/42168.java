private synchronized <A, B> void remove(com.iodesystems.fn.Async.Next<A, B> next) {
    nexts.remove(next);
}