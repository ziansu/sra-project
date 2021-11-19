public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
    painter.removeAllAnnotations();
    selectionChanged(((org.eclipse.jface.text.ITextSelection) (event.getSelection())));
}