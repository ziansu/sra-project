public static void closeDela() {
    if ((fr.umlv.unitex.DelaFrame.frame) == null) {
        return ;
    }
    fr.umlv.unitex.DelaFrame.frame.setVisible(false);
    fr.umlv.unitex.DelaFrame.frame.text = null;
    java.lang.System.gc();
}