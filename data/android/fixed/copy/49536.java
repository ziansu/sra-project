public static java.io.File selectFile(java.lang.String title) {
    return org.tinymediamanager.ui.TmmUIHelper.openJFileChooser(javax.swing.JFileChooser.FILES_ONLY, title, true, null, null);
}