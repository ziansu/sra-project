void update(int target, int value) {
    int index = target + (capacity);
    tree[index].value = value;
    maintain((index >> 1));
}