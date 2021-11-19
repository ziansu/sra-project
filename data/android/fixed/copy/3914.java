public void deleteApkWorkingDirectory() throws java.io.IOException {
    deleteApkDecompiledDirectory();
    deleteApkUnzipedDirectory();
    if ((workingDir) != null)
        sk.styk.martin.bakalarka.files.FileUtils.deleteDirectory(workingDir);
    
}