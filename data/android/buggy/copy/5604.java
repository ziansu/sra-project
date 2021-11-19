public void actionPerformed(java.awt.event.ActionEvent e) {
    final gui.LineNumberSyntaxPane syntaxPane = new gui.LineNumberSyntaxPane(gui.MainWindow.DEFAULT_FILE_EXTENSION);
    mw.openTab(syntaxPane, "(untitled)");
    mw.openFiles.add(new misc.Pair(null, syntaxPane));
}