public org.kohsuke.github.GHRepository getRepository() throws java.io.IOException {
    return root.getRepository(repo.getName());
}