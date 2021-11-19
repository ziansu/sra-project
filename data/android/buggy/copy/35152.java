@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    org.activityinfo.model.type.ReferenceType referenceType = ((org.activityinfo.model.type.ReferenceType) (formField.getType()));
    referenceType.getRange().addAll(dialog.getFormClassIds());
    setReferenceListItems(referenceType);
}