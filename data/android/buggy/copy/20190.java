public boolean hasToUpdateMetadata() throws java.io.IOException {
    int githubVersion = getGithubCSVVersion();
    if ((getPhoneCSVersion()) < githubVersion) {
        return true;
    }
    return false;
}