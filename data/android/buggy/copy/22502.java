@java.lang.Override
public void loadImage(java.lang.String inFile) {
    try {
        picture.loadImage(inFile);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    superClassActions.setImageSettings();
}