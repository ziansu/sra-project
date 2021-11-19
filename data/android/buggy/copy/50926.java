public void finish(java.lang.Integer threadInd) {
    threadsIsFinish[threadInd].set(true);
    java.lang.Thread.yield();
}