public java.util.List<org.saiku.olap.dto.SaikuHierarchy> getAllHierarchies(org.saiku.olap.dto.SaikuCube cube) throws org.saiku.olap.util.exception.SaikuOlapException {
    org.olap4j.metadata.Cube nativeCube = getNativeCube(cube);
    java.util.List<org.saiku.olap.dto.SaikuHierarchy> hierarchies = org.saiku.olap.util.ObjectUtil.convertHierarchies(nativeCube.getHierarchies());
    return hierarchies;
}