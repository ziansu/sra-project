@org.junit.Test
public void testIncrementUpperM() {
    for (int m = 1000; m <= 2000; m += 10) {
        Graph graph = new Graph("scc6.txt");
        Cycles c = new Cycles(graph);
        c.getCycles(m);
    }
}