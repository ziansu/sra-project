public java.lang.String getIconDirectoryPath() {
    java.lang.String ret = (edu.vt.beacon.editor.resources.icons.IconType.class.getPackage().getName().replace(".", java.lang.System.getProperty("file.separator"))) + (java.lang.System.getProperty("file.separator"));
    return ret;
}