private static void dispose() {
    for (it.polito.atlas.alea2.components.AnnotationShell a : it.polito.atlas.alea2.components.MainWindowShell.annotationShells)
        if (a != null)
            if ((a.shell()) != null)
                a.shell().close();
            
        
    
}