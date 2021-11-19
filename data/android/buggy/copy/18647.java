public java.lang.String getString() {
    return play.libs.IO.readContentAsString(getStream(), getEncoding());
}