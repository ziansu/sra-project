public void resolvePending() {
    com.sun.tools.javac.jvm.Code.Chain x = pendingJumps;
    pendingJumps = null;
    resolve(x, cp, 0);
}