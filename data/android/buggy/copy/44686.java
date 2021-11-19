public java.lang.Process startPackagesGet(@org.jetbrains.annotations.NotNull
io.flutter.pub.PubRoot root, @org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project) {
    final com.intellij.openapi.module.Module module = root.getModule(project);
    if (module == null)
        return null;
    
    return flutterPackagesGet(root).startInModuleConsole(module, root::refresh);
}