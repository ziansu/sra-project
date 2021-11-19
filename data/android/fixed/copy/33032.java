public void setNormals(float[] normals) {
    checkValidFloatArray("normals", normals, 3);
    org.gearvrf.NativeMesh.setNormals(getNative(), normals);
}