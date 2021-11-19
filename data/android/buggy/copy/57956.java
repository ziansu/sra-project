boolean delete(int target) {
    head = deleteNode(target, head);
    return (deleteNode(target, head)) == null;
}