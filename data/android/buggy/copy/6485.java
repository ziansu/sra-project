public void openPDFView(java.lang.String path) {
    android.content.Intent i = new android.content.Intent(c, io.github.antishake.TextReader.class);
    i.putExtra("Path", path);
    c.startActivity(i);
}