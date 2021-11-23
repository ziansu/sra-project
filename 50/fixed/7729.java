private java.lang.String getRelativePathOfFile(java.lang.String fullPath) {
    return org.opendatakit.utilities.ODKFileUtils.asRelativePath(((org.opendatakit.tables.activities.AbsBaseActivity) (getActivity())).getAppName(), new java.io.File(fullPath));
}