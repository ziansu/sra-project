public void swap(linked_yarn.LinkedYarn other) {
    (other.modCount)++;
    (modCount)++;
    linked_yarn.LinkedYarn.Node originalHead = head;
    head = other.head;
    other.head = originalHead;
}