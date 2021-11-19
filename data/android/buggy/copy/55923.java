private static java.lang.String setDiffFilePath(java.lang.String currentCommitHash, java.lang.String diffFilePath) {
    return (diffFilePath + (currentCommitHash.substring(0, 8))) + ".txt";
}