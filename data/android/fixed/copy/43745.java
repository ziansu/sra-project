void update(int target, int value) {
    int index = (target - 1) + (capacity);
    tree[index].value = value;
    maintain((index >> 1));
}