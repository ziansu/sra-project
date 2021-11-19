public java.lang.String getName() {
    if ((getTextFromLabel(guitests.guihandles.TaskCardHandle.NAME_FIELD_ID)) != null)
        throw new java.lang.IllegalStateException(("Name is found " + (getTextFromLabel(guitests.guihandles.TaskCardHandle.NAME_FIELD_ID))));
    
    return getTextFromLabel(guitests.guihandles.TaskCardHandle.NAME_FIELD_ID);
}