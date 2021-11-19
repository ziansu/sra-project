@java.lang.Override
public java.lang.Object getPropertyValue(java.lang.Object id) {
    return new eu.modelwriter.marker.ui.internal.views.propertiesview.DetailPropertySource(relatedElements.get(java.lang.Integer.parseInt(id.toString())));
}