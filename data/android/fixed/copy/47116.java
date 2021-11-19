private java.util.List<net.tascalate.concurrent.DependentPromise<T>> self(boolean enlist) {
    return enlist ? java.util.Collections.singletonList(this) : java.util.Collections.emptyList();
}