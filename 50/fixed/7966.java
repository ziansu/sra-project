public void sendVboData() {
    verticesVbo.sendDataAutoBind();
    colorsVbo.sendDataAutoBind();
    if (indexed) {
        indicesVbo.sendDataAutoBind();
    }
    if ((normalsVbo) != null) {
        normalsVbo.sendDataAutoBind();
    }
}