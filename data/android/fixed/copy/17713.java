public void setContent(java.lang.String html, java.lang.String masterCSS) {
    this.document = new zetes.wings.litehtml.jni.Document(html, masterCSS, container);
    redraw();
}