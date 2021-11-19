private void intersection() {
    newGraph = union(complement(this.graphA), complement(this.graphB));
    faops.DumpDot dump = new faops.DumpDot(newGraph);
    dump.dumpFile("exitTest.dot");
}