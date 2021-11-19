private static io.crate.operation.merge.SortingBucketMerger.PeekingRowIterator peekingIterator(java.util.Iterator<? extends io.crate.core.collections.Row> iterator) {
    if (iterator instanceof io.crate.operation.merge.SortingBucketMerger.PeekingRowIterator) {
        return ((io.crate.operation.merge.SortingBucketMerger.PeekingRowIterator) (iterator));
    }
    return new io.crate.operation.merge.SortingBucketMerger.PeekingRowIterator(iterator);
}