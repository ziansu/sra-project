public boolean isInstanceOf(com.ninty.runtime.heap.NiClass clz) {
    return this.clz.isAssignableFrom(clz);
}