public boolean loadComponents(org.eclipse.egit.github.core.IRepositoryIdProvider repoId) {
    this.repoId = repoId;
    java.lang.System.out.println(("model " + repoId));
    return true;
}