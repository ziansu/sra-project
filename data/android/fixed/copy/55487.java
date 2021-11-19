private boolean removeButAlloc(net.openhft.smoothie.SmoothieMap<K, V> map, long slotIndex) {
    (map.size)--;
    (map.modCount)++;
    return slotIndex != (shiftRemove(slotIndex));
}