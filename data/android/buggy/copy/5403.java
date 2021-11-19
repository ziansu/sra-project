public org.eclipse.jface.viewers.TreePath[] getParents(java.lang.Object element_p) {
    java.util.List<java.util.List<org.eclipse.emf.diffmerge.api.IMatch>> resultAsList = getPathsFor(((org.eclipse.emf.diffmerge.api.IMatch) (element_p)), true);
    return org.eclipse.emf.diffmerge.ui.util.UIUtil.toTreePaths(resultAsList);
}