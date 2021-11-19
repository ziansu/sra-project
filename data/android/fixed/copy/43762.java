public synchronized void registerThread(com.oracle.truffle.llvm.nodes.base.LLVMThreadNode thread) {
    assert !(runningThreads.contains(thread));
    runningThreads.add(thread);
}