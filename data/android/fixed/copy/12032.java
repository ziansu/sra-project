protected org.miradi.objects.BaseObject getSingleSelectedObject() {
    org.miradi.objects.BaseObject[] selectedObjects = getObjects();
    if (selectedObjects == null)
        return null;
    
    if ((selectedObjects.length) != 1)
        return null;
    
    return selectedObjects[0];
}