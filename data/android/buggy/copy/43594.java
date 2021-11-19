public void testPercolationSystemSizeOne() {
    Percolation percolation;
    percolation = new Percolation(1);
    assertFalse(percolation.percolates());
    percolation.open(0, 0);
    assertTrue(percolation.percolates());
}