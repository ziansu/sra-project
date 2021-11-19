@java.lang.Override
public java.lang.Object getPropertyValue(java.lang.Object id) {
    for (int i = 0; i < (relatedElements.size()); i++) {
        return new eu.modelwriter.marker.ui.internal.views.propertiesview.DetailPropertySource(relatedElements.get(i));
    }
    return null;
}