private void extractFaceIndexes(java.lang.String group) {
    for (java.lang.String value : group.split(com.fernandosierra.obj2es2.Converter.FACE_SPLITTER)) {
        faces.add(java.lang.Integer.parseInt(value));
    }
}