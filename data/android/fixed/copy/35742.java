private void heightTest3(algo.data.structures.BinarySearchTree<java.lang.Integer> bs) {
    for (int i = 10; i > 0; --i) {
        bs.add(i);
    }
    assertEquals(10, bs.height());
}