public void addOutput(java.lang.String id) {
    edu.miamioh.SchematicRenderer.Port temp = new edu.miamioh.SchematicRenderer.Port("OUTPUT", id, ((maxLevel)++));
    ports.add(temp);
}