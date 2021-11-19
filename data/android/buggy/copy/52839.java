@java.lang.Override
public void onBackPressed() {
    if ((com.johnny.ultimateocr.FileHelpers.documentsHome) == (currentDir)) {
    }else {
        java.io.File folder = new java.io.File(currentDir.getParent());
        fillGrid(folder);
    }
}