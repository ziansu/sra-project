public synchronized void shutdownThreads() {
    for (com.oracle.truffle.llvm.nodes.base.LLVMThreadNode node : new java.util.ArrayList(runningThreads)) {
        node.stop();
    }
}