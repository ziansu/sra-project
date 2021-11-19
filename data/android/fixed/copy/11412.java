public boolean isApplyPermissionToAllNewPartsForCurrent() {
    if ((getCurrent().getContainedInBOM()) != null) {
        return getCurrent().getContainedInBOM().isApplyPermissionToAllNewParts();
    }
    return false;
}