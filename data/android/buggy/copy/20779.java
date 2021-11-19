private boolean isJavaFile(final org.eclipse.core.resources.IFile file) {
    final java.lang.String fileExtension = file.getFileExtension();
    return (fileExtension.equals("java")) || (fileExtension.equals("jak"));
}