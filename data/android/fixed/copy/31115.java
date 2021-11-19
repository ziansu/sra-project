public synchronized void pop() {
    if ((dispatchTargets.size()) > 1) {
        this.dispatchTargets.pop();
    }
}