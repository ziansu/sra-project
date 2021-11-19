public void swap(linked_yarn.LinkedYarn other) {
    (other.modCount)++;
    (modCount)++;
    linked_yarn.LinkedYarn.Node originalHead = this.head;
    this.head = other.head;
    other.head = originalHead;
}