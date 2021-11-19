@java.lang.Override
public java.lang.String getCharSet() {
    java.lang.String res = this.pdFont.getFontDescriptor().getStringKey(ASAtom.CHAR_SET);
    return res == null ? "" : res;
}