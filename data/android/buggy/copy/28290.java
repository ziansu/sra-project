private void makeSourceFolderIfNecessary(final org.eclipse.core.resources.IFolder folder) throws org.eclipse.core.runtime.CoreException {
    if (org.moflon.ide.core.runtime.builders.RepositoryBuilder.isSourceFolder(folder)) {
        org.moflon.ide.core.runtime.builders.RepositoryBuilder.makeSourceFolder(getProject(), folder);
    }
}