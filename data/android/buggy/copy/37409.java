public static org.eclipse.jdt.core.IPackageFragment[] getPackages(org.eclipse.jdt.core.IJavaProject project) throws org.eclipse.jdt.core.JavaModelException {
    if (project.isOpen()) {
        return null;
    }
    return project.getPackageFragments();
}