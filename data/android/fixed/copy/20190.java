public boolean hasToUpdateMetadata() throws java.io.IOException {
    githubVersion = getGithubCSVVersion();
    if ((getPhoneCSVersion()) < (githubVersion)) {
        return true;
    }
    return false;
}