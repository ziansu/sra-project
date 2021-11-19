private boolean hasRight(int childIndex) {
    T rightChild = this.sequence.get(((2 * childIndex) + 2));
    return (this.sequence.get(childIndex).compareTo(rightChild)) < 0;
}