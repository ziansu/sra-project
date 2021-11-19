@java.lang.Override
public void setLevel(java.lang.String level) {
    if ((currentStructure) != null) {
        currentStructure.setLevel(level);
        model.setPlane(currentStructure.getName(), currentStructure.getLevel());
    }
}