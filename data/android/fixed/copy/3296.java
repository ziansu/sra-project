public void put(long key, int val) {
    root = put(root, key, val);
    rootIsSet = true;
    keyColorMap.put(root, 1);
}