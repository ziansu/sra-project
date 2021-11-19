public void openFiles(com.apple.eawt.AppEvent.OpenFilesEvent e) {
    for (java.lang.Object file : e.getFiles()) {
        if (file instanceof java.io.File)
            new de.unistuttgart.ims.annotationviewer.XMIViewer(((java.io.File) (file)));
        
    }
}