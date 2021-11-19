@java.lang.Override
public boolean isFileOfType(@org.jetbrains.annotations.NotNull
com.intellij.openapi.fileTypes.impl.VirtualFile file, @org.jetbrains.annotations.NotNull
com.intellij.openapi.fileTypes.impl.FileType type) {
    if (type instanceof com.intellij.openapi.fileTypes.impl.FileTypeIdentifiableByVirtualFile) {
        return ((com.intellij.openapi.fileTypes.impl.FileTypeIdentifiableByVirtualFile) (type)).isMyFileType(file);
    }
    return (getFileTypeByFileName(file.getName())) == type;
}