@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        gui.GUI4.startGame(gui.GUI4.getLastUsedFile());
    } catch (java.io.FileNotFoundException e1) {
        e1.printStackTrace();
    }
}