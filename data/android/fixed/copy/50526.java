private static boolean lockCountsAreCorrect(org.avidj.zuul.core.LockTreeNode root) {
    synchronized(root) {
        return ((org.avidj.zuul.core.DefaultLockManager.readCount(root)) == (root.reads)) && ((org.avidj.zuul.core.DefaultLockManager.writeCount(root)) == (root.writes));
    }
}