private void saveNewVersion() throws java.io.IOException {
    org.eyeseetea.sdk.common.FileUtils.saveFile(PopulateDB.VERSIONS_CSV, java.lang.String.valueOf(githubVersion).getBytes(), mContext);
}