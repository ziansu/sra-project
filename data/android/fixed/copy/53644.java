private java.lang.String getFolderToPutIn() {
    skillsplanner.beans.DFOClass selected = ((skillsplanner.beans.DFOClass) (baseClass.getSelectedItem()));
    return selected.getUniqueName();
}