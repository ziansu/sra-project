@java.lang.Override
public void warmupQuery() {
    int idx = rand.nextInt(node_warmup);
    this.warmupQuery(g, rand.nextInt(idx));
}