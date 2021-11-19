protected void LeftRotate(Node<T> x, Node<T> y) {
    super.LeftRotate(x, y);
    SetHeight(x);
    SetHeight(y);
}