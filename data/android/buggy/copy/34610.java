final void remove(net.openhft.smoothie.SmoothieMap<K, V> map, long slotIndex, long allocIndex) {
    eraseAlloc(allocIndex);
    removeButAlloc(map, slotIndex);
}