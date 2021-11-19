private boolean hasRight(int childIndex) {
    T rightChild = this.sequence.get(childIndex);
    if (rightChild == null) {
        return false;
    }
    return true;
}