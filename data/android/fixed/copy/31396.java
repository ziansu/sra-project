public Algortime.BSTNode insertAVL(int number) {
    if ((root) == null) {
        root = new Algortime.BSTNode(number);
    }else {
        root = root.insertAVLNode(number);
    }
    return null;
}