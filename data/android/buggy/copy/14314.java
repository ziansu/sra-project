public boolean canRedo() {
    return !(((index) > (-1)) || ((((stack.size) - 1) + (index)) < 0));
}