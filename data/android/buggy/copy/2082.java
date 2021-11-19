private void setLeft(int p_currentIndex, int p_paramIndex) {
    if (p_currentIndex != (-1)) {
        _back_meta[(p_currentIndex * (greycat.internal.heap.HeapSuperTimeTreeChunk.META_SIZE))] = p_paramIndex;
    }
}