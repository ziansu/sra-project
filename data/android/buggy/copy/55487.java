private void removeButAlloc(net.openhft.smoothie.SmoothieMap<K, V> map, long slotIndex) {
    shiftRemove(slotIndex);
    (map.size)--;
    (map.modCount)++;
}