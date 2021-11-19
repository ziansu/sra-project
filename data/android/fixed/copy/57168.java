@java.lang.Override
public boolean add(java.net.URL url) {
    try {
        createWebHook(url);
        return true;
    } catch (java.io.IOException e) {
        throw new org.kohsuke.github.GHException("Failed to update post-commit hooks", e);
    }
}