@java.lang.Override
public void setLevel(java.lang.String level) {
    currentStructure.setLevel(level);
    model.setPlane(currentStructure.getName(), currentStructure.getLevel());
}