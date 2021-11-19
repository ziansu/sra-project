void nodeEntry() {
    if (!(this.failureFree)) {
        initialization();
        entryRequest();
        for (java.lang.Integer node : testerOf) {
            performTest(node);
        }
    }
}