private E findLargestChild(edu.sju.Node<E> parent) {
    if ((parent.right.right) == null) {
        E returnValue = parent.right.data;
        parent.right = parent.right.left;
        return returnValue;
    }else {
        return findLargestChild(parent.right);
    }
}