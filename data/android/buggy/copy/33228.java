private void checkForSelection(java.awt.Point click) {
    setCurrentSelectedEntity(clickedOnEntity(click));
    if ((currentSelectedEntity) != null)
        currentDebugEntity = clickedOnEntity(click);
    
}