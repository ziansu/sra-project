private java.lang.String getPackage(java.lang.String fullyQualifiedClassName) {
    if (fullyQualifiedClassName.contains(org.jboss.tools.fuse.transformation.editor.internal.util.ImportExportPackageUpdater.DEFAULT_PACKAGE_EXPORT)) {
        return fullyQualifiedClassName.substring(0, fullyQualifiedClassName.lastIndexOf('.'));
    }else {
        return null;
    }
}