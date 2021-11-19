public void actionPerformed(java.awt.event.ActionEvent e) {
    cleanPanel();
    try {
        is.hi.f2a.frontend.Main.getInstance().startGame(names);
    } catch (is.hi.f2a.tests.InvalidPlayer | is.hi.f2a.tests.InvalidPosition | is.hi.f2a.tests.InvalidUser | java.io.IOException e1) {
        e1.printStackTrace();
    }
}