public int[] getPredecessors(int i) {
    return (reverse) != null ? reverse.getSuccessors(i) : new int[0];
}