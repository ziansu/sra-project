public java.lang.String getString(java.lang.String encoding) {
    return play.libs.IO.readContentAsString(getStream(), encoding);
}