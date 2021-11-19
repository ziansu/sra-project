final boolean remove(net.openhft.smoothie.SmoothieMap<K, V> map, long slotIndex, long allocIndex) {
    eraseAlloc(allocIndex);
    return removeButAlloc(map, slotIndex);
}