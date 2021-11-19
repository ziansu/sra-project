public void load(java.io.File file) throws at.pcgamingfreaks.yaml.YAMLInvalidContentException, java.io.IOException {
    java.io.FileInputStream inputStream = new java.io.FileInputStream(file);
    load(inputStream);
    inputStream.close();
}