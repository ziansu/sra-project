public org.kohsuke.github.GHContent getLicenseContent() throws java.io.IOException {
    org.kohsuke.github.Requester requester = root.retrieve();
    return root.retrieve().to(getApiTailUrl("license"), org.kohsuke.github.GHContent.class).wrap(this);
}