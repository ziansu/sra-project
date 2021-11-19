protected java.lang.String getFilterFileLocation() {
    org.eclipse.core.resources.IResource filterFile = getProject().findMember(de.tobject.findbugs.test.AbstractFindBugsTest.FILTER_FILE);
    return filterFile.getLocation().toOSString();
}