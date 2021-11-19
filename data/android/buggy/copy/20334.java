@org.jetbrains.annotations.Nullable
@java.lang.Override
public javax.swing.Icon getIcon(@org.jetbrains.annotations.NotNull
com.intellij.openapi.vfs.VirtualFile file, @com.intellij.openapi.util.Iconable.IconFlags
int flags, @org.jetbrains.annotations.Nullable
com.intellij.openapi.project.Project project) {
    if (project == null)
        return null;
    
    if (file.getExtension().equalsIgnoreCase(ZulFileType.EXTENSION))
        return ZulIcons.FILE;
    
    return null;
}