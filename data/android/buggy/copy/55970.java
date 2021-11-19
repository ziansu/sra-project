public void run() {
    try {
        java.lang.String lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        javax.swing.UIManager.setLookAndFeel(lookAndFeel);
        com.neucrack.GUI.PandaTVDanmu frame = new com.neucrack.GUI.PandaTVDanmu();
        frame.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}