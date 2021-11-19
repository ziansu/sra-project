public void update(final java.io.File root) throws org.apache.maven.scm.ScmException {
    this.scmManager.update(scmRepository, new org.apache.maven.scm.ScmFileSet(root));
}