private static void dispose() {
    for (it.polito.atlas.alea2.components.AnnotationShell a : it.polito.atlas.alea2.components.MainWindowShell.annotationShells)
        a.shell().close();
    
}