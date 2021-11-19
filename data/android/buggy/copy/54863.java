public synchronized void shutdownThreads() {
    for (com.oracle.truffle.llvm.nodes.base.LLVMThreadNode node : runningThreads) {
        node.stop();
    }
}